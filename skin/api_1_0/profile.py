# __author__: Mai feng
# __file_name__: profile.py
# __time__: 2019:11:08:19:38


from skin.api_1_0 import api
from flask import jsonify, session, current_app, request, g
from skin.utils.response_code import RET
from skin.utils.common import login_required
from skin.models import User
from skin import db, constants
from skin.utils.common import login_required
from skin.utils.qiniu_util import upload_image


@api.route('/users')
@login_required
def get_user_info():
    '''获取用户个人信息,前提用户已经登录
    :param 无
    :return: json
    '''
    # 获取用户id
    user_id = g.user_id
    try:
        user = User.query.filter(User.id == user_id).first()
    except Exception as e:
        current_app.logger.debug(e)
        return jsonify(re_code=RET.DBERR, msg='数据库查询错误')

    # 判断用户是否存在
    if not user:
        return jsonify(re_code=RET.NODATA, msg='用户不存在')

    # 查询用户信息
    user_info = user.to_dict()
    return jsonify(re_code=RET.OK, msg='查询成功', user=user_info)
    



@api.route('/users/avatar', methods=['POST'])
@login_required
def update_user_avatar():
    '''修改用户头像
    :param: 
    :return: json
    '''
    # 获取图片数据
    avatar = request.files.get('avatar')
    if not avatar:
        return jsonify(re_code=RET.PARAMERR, msg='图片不能为空')


    # 上传到七牛云
    try:
        key = upload_image(avatar.read())
    except Exception as e:
        current_app.logger.debug(e)
        return jsonify(re_code=RET.THIRDERR, msg='上传图片失败')

    user_id = g.user_id

    # 保存到数据库
    try:
        user = User.query.filter(User.id == user_id).first()
    except Exception as e:
        current_app.logger.debug(e)
        return jsonify(re_code=RET.DBERR, msg='查询数据库错误')

    if not user:
        return jsonify(re_code=RET.NODATA, msg='用户不存在')

    user.avatar_url = key

    try:
        db.session.commit()
    except Exception as e:
        current_app.logger.debug(e)
        db.session.rollback()
        return jsonify(re_code=RET.DBERR, msg='保存头像失败')

    # 拼接头像地址，返回前端
    avatar_url = constants.QINIU_DOMIN_PREFIX + key
    return jsonify(re_code=RET.OK, msg='上传头像成功', avatar_url=avatar_url)