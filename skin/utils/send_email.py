# __author__: Mai feng
# __file_name__: send_email.py
# __time__: 2019:11:06:22:00

from flask_mail import Message
from skin import mail

def send_email_code(to_email, code):
    '''发送邮件方法
    :param 
        1.to_email: 发送邮箱
        2. code : 
    '''
    title = 'skin manage system'
    body = '跳转前端激活链接/' + code
    msg = Message(title,  recipients=[to_email], body=body)
    mail.send(msg)