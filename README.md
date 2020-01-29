# Spring书籍、源码分析与学习
## 引言
> 个人Spring学习之旅，📝笔记。

## 参考笔记
- [b站视频入口](https://www.bilibili.com/video/av32102436?p=1)
- [代码资料](https://gitee.com/adanzzz/spring_source_parsing_data)
## 思维导图
- [spring注解驱动开发](https://www.processon.com/view/link/5e30213ae4b096de64c8e9bf)


## 目录说明
### 组件注册
- [xml注册bean方式](/spring-annotation/src/main/resources/beans.xml)
- [xml注册包扫描方式](/spring-annotation/src/main/resources/beans.xml)
- [注解注册bean方式](/spring-annotation/src/main/java/org/example/config/MainConfig.java)
- [注解注册包扫描方式](/spring-annotation/src/main/java/org/example/config/MainConfig.java)
- [@Filter的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfFilter.java)
- [@Scope的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfScope.java)
- [@Lazy的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfScope.java)
- [@Conditional的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfConditional.java)
- [@Import的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfImport.java)
### 生命周期
- [bean的生命周期](/spring-annotation/src/main/java/org/example/config/MainConfigOfLifeCycle.java)
### 属性赋值
- [@Value的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfValue.java)
- [@PropertySource的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfValue.java)
### 自动装配
- [@Autowired的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfAutowired.java)
- [@Qualifier的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfAutowired.java)