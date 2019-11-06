# __author__: Mai feng
# __file_name__: models.py
# __time__: 2019:10:30:21:20
from datetime import datetime
from . import db, constants
from werkzeug.security import generate_password_hash,check_password_hash

class BaseModel(object):
    '''模型基类
    '''
    create_time=db.Column(db.DateTime, default=datetime.now()) #记录模型类创建时间
    update_time=db.Column(db.DateTime, default=datetime.now, onupdate=datetime.now())#记录模型类更新时间


class UserBaseModel(object):
    id = db.Column(db.Integer, primary_key=True) # id
    name = db.Column(db.String(32)) # 名字
    password = db.Column(db.String(128), nullable=False) # 用户密码
    phone = db.Column(db.String(11), nullable=True) # 用户手机号码，用手机号码注册
    age = db.Column(db.String(3), nullable=True) # 用户年龄
    email = db.Column(db.String(128), nullable=True) # 用户邮箱
    avatar_url = db.Column(db.String(256), nullable=True) # 用户头像
    address = db.Column(db.String(128), nullable=True) # 用户地址


class User(UserBaseModel, BaseModel, db.Model):
    '''用户模型
    '''
    __tablename__ = 'sk_user_profile'

    skin_imgs = db.relationship('SkinImage', backref='user') # 用户皮肤图片集

    @property
    def password_hash(self):
        raise AttributeError('不能访问该属性')

    @password_hash.setter
    def password_hash(self, password):
        # 给密码加密
        self.password = generate_password_hash(password)

    def check_password(self, password):
        # 校验密码是否正确
        return check_password_hash(self.password, password)


    def to_dict(self):
        '''返回一个用户信息字典接口，方便外界调用
        '''
        user_info = {
            'user_id': self.id,
            'name': self.name,
            'phone': self.phone,
            'avatar_url': self.avatar_url,
            'age': self.age,
            'address': self.address,
        }
        # if self.avatar_url:
        #     user_info['avatar_url'] = constants.QINIU_DOMIN_PREFIX + self.avatar_url
        return user_info


class SkinImage(BaseModel, db.Model):
    '''用户皮肤病图片集合
    '''
    __tablename__ = 'sk_skin_image'
    id = db.Column(db.Integer, primary_key=True) # id
    name = db.Column(db.String(32)) # 名字
    url = db.Column(db.String(256), nullable=True) # 链接
    user_id = db.Column(db.Integer, db.ForeignKey('sk_user_profile.id'), nullable=False) # 用户id