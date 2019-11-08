# __author__: Mai feng
# __file_name__: profile.py
# __time__: 2019:11:08:19:38


from skin.api_1_0 import api
from flask import jsonify, session, current_app, request, g
from skin.utils.response_code import RET
from skin.utils.common import login_required
from skin.models import User
from skin import db, constants


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
    