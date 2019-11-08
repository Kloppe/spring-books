# __author__: Mai feng
# __file_name__: __init__.py
# __time__: 2019:10:30:21:29

from flask.blueprints import Blueprint

# 需求url:127.0.0.1:5000/api/1.0/index
api=Blueprint('api_1_0',__name__,url_prefix='/api/1.0')

# 为了能调用到视图需要导入
from . import demo
from .import verify, passport, profile