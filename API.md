# API接口文档说明
## BaseURL
**http://localhost:5000/api/1.0**
## 图片验证码接口
```json
url: /imageCode
method: get
param:
 -   1. uuid: 随机的字符串
 -   2. last_uuid: 上次随机字符串,可以为空，但最好不要为空
 return:
-   图片验证码
usage：BaseURL/imageCode?uuid=456&last_uuid=123
```


## 注册登录登出接口
### 注册
```json
url: /register
method: post
param:
 -   1. email: 用户邮箱
 -   2. email_code: 验证码
 -   3. password：密码
 -   4. password2：再次输入密码
 -   5. uuid: 验证码的uuid
 return:
-   json
usage：BaseURL/register
{
	"email":"470957137@qq.com",
	"email_code":"PILN",
	"password":"123",
	"password2":"123",
	"uuid":"123"
}
return:
{
    "msg": "注册成功",
    "re_code": "0"
}
```
### 登录
```json
url: /sessions
method: post
param:
 -   1. email: 用户邮箱
 -   2. password：密码
 return:
-   json
usage：BaseURL/sessions
{
	"email":"470957137@qq.com",
	"password":"123"
}
return:
{
    "msg": "登陆成功",
    "re_code": "0"
}
```
### 登出
```json
url: /sessions
method: delete
usage：BaseURL/sessions
return:
{
    "msg": "退出成功",
    "re_code": "0"
}
```