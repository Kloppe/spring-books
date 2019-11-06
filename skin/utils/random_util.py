# __author__: Mai feng
# __file_name__: random_util.py
# __time__: 2019:11:06:21:56
import random

def get_code(length):
    '''生成固定长度的校验码
    :param length: 长度
    :return: code:str
    '''
    rand_str = '1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM'
    random.seed()
    number = []
    for i in range(length):
        number.append(random.choice(rand_str))
    code = ''.join(number)
    return code


