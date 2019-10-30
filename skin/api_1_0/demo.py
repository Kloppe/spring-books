# __author__: Mai feng
# __file_name__: demo.py
# __time__: 2019:10:30:21:30

from . import api
from .. import models

@api.route('/demo')

def demo():
    '''
    测试
    :return:  'Hello World'
    '''

    return 'Hello World 1.0'