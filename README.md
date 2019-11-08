# Skin Disease后端
## 技术
- flask
- mysql
- crsk
- keras
- email
- ~~redis~~

## 前端链接
**待定**

## API文档
[点我](./API.md)

## 时间节点

### 2019.11.8
- 创建common文件
- 登录装饰器

### 2019.11.6
- 创建response_code文件
- 编写状态码
- 创建verify文件
- 编写验证码接口
- 编写邮箱配置

### 2019.11.5
- 编写constants参数
- 添加验证码工具库
- 编写七牛云工具库
- 创建passport逻辑文件
- 编写注册逻辑接口

### 2019.11.4
- 创建数据库模型

### 2019.10.30
- 创建环境
- 创建API文档
- 创建说明文档
- 创建部署文件

## 测试
- 在根目录下生成日志文件`mkdir logs`
- python版本：3.6+
- 安装库`pip install -r requirements.txt`
- `python manage.py runserver`
- 浏览器输入`localhost:5000/api/1.0/demo`
- 出现`Hello Skin...`


