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


