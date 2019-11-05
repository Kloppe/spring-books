
# __author__: Mai feng
# __file_name__: qiniu_util.py
# __time__: 2019:11:05:16:31

from qiniu import Auth, put_data

access_key = "JqUXOBEInJqioQZWBD1PvAvsqbUlXVZApQ-eTHoE"
#七牛secret_key
secret_key = "Mxg1w7V_E-vyP6XsFYnGx5Y4uklu9efH0MW_IP9d"
#上传的空间名
bucket_name = 'skindisease'

def upload_image(data):
    """上传图片方法"""
    # 构建鉴权对象
    q = Auth(access_key,secret_key)
    # 生成上传token,可以指定过期时间
    token = q.upload_token(bucket_name)
 
    # 上传二进制文件流
    ret, info = put_data(token,None,data)
    #返回结果：({u'hash': u'FrsdIVZsIZA6p4WXOzdxBLxiyQ2O', u'key': u'avatar'},
    # exception:None, status_code:200)
    if 200 == info.status_code:
        return ret.get('key')
    else:
        raise Exception('上传图片到七牛云失败')


if __name__ == "__main__":
    # 测试该方法
    with open('demo.jpeg', 'rb') as f:
        data = f.read()
    key = upload_image(data)
    print(key)
    pass