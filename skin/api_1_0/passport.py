# __author__: Mai feng
# __file_name__: passport.py
# __time__: 2019:11:05:22:19

from skin.api_1_0 import api
from flask import request, jsonify, current_app, session
from skin.utils.response_code import RET
import re
from skin import redis_conn, db
from skin.models import User
from skin.utils.common import login_required


@api.route('/register', methods=['POST'])
def register():
    '''用户注册接口
        - 暂时不用手机验证码，有成本...
    :param json
        1. email: 用户邮箱
        2. email_code: 验证码
        3. password：密码
        4. password2：再次输入密码
        5. uuid: 验证码的uuid
    :return: json
    '''
    data = request.json
    email = data.get('email')
    email_code = data.get('email_code')
    password = data.get('password')
    password2 = data.get('password2')
    uuid = data.get('uuid')

    # 检测参数
    if not all([email, email_code, password, password2, uuid]):
        return jsonify(re_code=RET.PARAMERR, msg='参数缺少')

    # 检查邮箱是否正确
    if not re.match(r'\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}', email):
        return jsonify(re_code=RET.PARAMERR, msg='邮箱格式错误')

    # 取出验证码，判断验证码是否正确
    try:
        image_code_server = redis_conn.get('ImageCode' + uuid)
    except Exception as e:
        current_app.logger.debug(e)
        return jsonify(re_code=RET.DBERR, msg='获取图片验证码失败')

    # 判断验证码是否已经过期
    if not image_code_server:
        return jsonify(re_code=RET.NODATA, msg='验证码已经过期')   

    # 取完就删除
    try:
        redis_conn.delete('ImageCode' + uuid)
    except Exception as e:
        current_app.logger.debug(e)
        
    # 判断用户输入的验证码是否正确
    if email_code.lower() != image_code_server.lower():
        return jsonify(RET.DATAERR, msg='验证码输入有误')

    # 判断用户输入的两次密码是否一致
    if password != password2:
        return jsonify(RET.DATAERR, msg='两次密码不一致')

    # 判断用户是否注册
    try:
        user = User.query.filter(User.email == email).first()
    except Exception as e:
        current_app.logger.debug(e)
        return jsonify(re_code=RET.DBERR, msg='查询数据库错误')
    
    if user:
        return jsonify(re_code=RET.DATAEXIST, msg='该用户已经存在')
    user = User()
    user.name = email
    user.email = email
    user.password_hash = password

    try:
        db.session.add(user)
        db.session.commit()
    except Exception as e:
        current_app.logger.debug(e)
        db.session.rollback()
        return jsonify(re_code=RET.DBERR, msg='注册失败，用户已经存在')
        
    # 保持登录状态
    session['user_id'] = user.id
    session['name'] = email
    session['email'] = email

    return jsonify(re_code=RET.OK, msg='注册成功')


@api.route('/sessions', methods=['POST'])
def login():
    '''用户登录接口
    :param json
        1. email: 用户邮箱
        2. password：密码
    :return: json
    '''
    data = request.json
    email = data.get('email')
    password = data.get('password')

    # 判断是否缺少参数
    if not all([email, password]):
        return jsonify(re_code=RET.PARAMERR, msg='缺少参数')
    
    # 检查邮箱是否正确
    if not re.match(r'\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}', email):
        return jsonify(re_code=RET.PARAMERR, msg='邮箱格式错误')

    # 判断用户是否存在
    try:
        user = User.query.filter(User.email == email).first()
    except Exception as e:
        current_app.logger.debug(e)
        return jsonify(re_code=RET.DBERR, msg='数据库查询错误')

    if not user:
        return jsonify(re_code=RET.NODATA, msg='用户不存在')

    if not user.check_password(password):
        return jsonify(re_code=RET.PARAMERR, msg='密码错误')

    # 存session

    session['user_id'] = user.id
    session['name'] = user.email
    session['email'] = user.email

    return jsonify(re_code=RET.OK, msg='登陆成功')

@api.route('/sessions', methods=['DELETE'])
@login_required # 登录检验
def logout():
    '''退出登录功能，删除session
    :return: json
    '''
    session.pop('user_id')
    session.pop('email')
    session.pop('name')
    return jsonify(re_code=RET.OK,msg='退出成功')
