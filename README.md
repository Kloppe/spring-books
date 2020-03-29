# Spring书籍、源码分析与学习
## 引言
> 个人Spring学习之旅，📝笔记。

## 参考笔记
- [b站视频入口](https://www.bilibili.com/video/av32102436?p=1)
- [代码资料](https://gitee.com/adanzzz/spring_source_parsing_data)
## 思维导图
- [Spring注解驱动开发](https://www.processon.com/view/link/5e30213ae4b096de64c8e9bf)


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
- [@Profile的使用](/spring-annotation/src/main/java/org/example/config/MainConfigOfProfile.java)
### AOP
- [AOP小例子](/spring-aop/src/main/java/org/example/config/MainConfigOfAOP.java)
### 事务
- [Spring事务](/spring-annotation/src/main/java/org/example/tx/MainConfigOfTx.java)
- [Spring事务源码](/spring-annotation/src/main/java/org/example/tx/MainConfigOfTx.java)
### 扩展原理
- [BeanFactoryPostProcessor](/spring-annotation/src/main/java/org/example/ext/MyBeanFactoryPostProcessor.java)
- [BeanDefinitionRegistryPostProcessor](/spring-annotation/src/main/java/org/example/ext/MyBeanDefinitionRegistryPostProcessor.java)
- [ApplicationListener](/spring-annotation/src/main/java/org/example/ext/MyApplicationListener.java)
## 源码总结
- [Spring和SpringAOP](/Spring和SpringAOP源码总结.md)
- [参考这位大佬的MVC原理](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringMVC-Principle) **这位大佬总结的不错，可参考**
- [SpringMVC开发文档](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html) **这里就不贴视频中的SpringMVC工程**
## 手写简单的IOC和AOP
- [手写简单的IOC](/spring-ioc) 非常简单，每行都有注释
- [手写简单的AOP](/spring-aop2) 非常简单，每行都有注释

## SpringBoot
**[参考这位大佬](https://snailclimb.gitee.io/springboot-guide/#/)**
**项目结构过于具体简单的文件解释就不说了，主要是看细节和原理**
- [SpringBoot启动流程分析](/SpringBoot启动流程分析.md)


## Spring常见面试问题
- [参考这位大佬总结的，挺好的](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions) 其实专注一个参考资料，认真备面就完全ok
- [什么是Spring框架](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_1-%e4%bb%80%e4%b9%88%e6%98%af-spring-%e6%a1%86%e6%9e%b6)
- [列举一些重要的Spring模块](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_2-%e5%88%97%e4%b8%be%e4%b8%80%e4%ba%9b%e9%87%8d%e8%a6%81%e7%9a%84spring%e6%a8%a1%e5%9d%97%ef%bc%9f)
- [@RestController vs @Controller](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_3-restcontroller-vs-controller)
- **@ResponseBody的作用**：**注解的作用是将 Controller 的方法返回的对象通过适当的转换器转换为指定的格式之后，写入到HTTP 响应(Response)对象的 body 中，通常用来返回 JSON 或者 XML 数据，返回 JSON 数据的情况比较多。**
- [谈谈自己对于Spring IoC和AOP的理解](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_41-%e8%b0%88%e8%b0%88%e8%87%aa%e5%b7%b1%e5%af%b9%e4%ba%8e-spring-ioc-%e5%92%8c-aop-%e7%9a%84%e7%90%86%e8%a7%a3)
- [SpringAOP和AspectAOP有什么区别](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_41-%e8%b0%88%e8%b0%88%e8%87%aa%e5%b7%b1%e5%af%b9%e4%ba%8e-spring-ioc-%e5%92%8c-aop-%e7%9a%84%e7%90%86%e8%a7%a3)
- [Spring中的bean的作用域有哪些](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_51-spring-%e4%b8%ad%e7%9a%84-bean-%e7%9a%84%e4%bd%9c%e7%94%a8%e5%9f%9f%e6%9c%89%e5%93%aa%e4%ba%9b)
- [Spring中的单例bean的线程安全问题了解吗](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_52-spring-%e4%b8%ad%e7%9a%84%e5%8d%95%e4%be%8b-bean-%e7%9a%84%e7%ba%bf%e7%a8%8b%e5%ae%89%e5%85%a8%e9%97%ae%e9%a2%98%e4%ba%86%e8%a7%a3%e5%90%97%ef%bc%9f)
- [@Component和@bean的区别是什么](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_53-component-%e5%92%8c-bean-%e7%9a%84%e5%8c%ba%e5%88%ab%e6%98%af%e4%bb%80%e4%b9%88%ef%bc%9f)
- [将一个类声明为Spring的bean的注解有哪些](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_54-%e5%b0%86%e4%b8%80%e4%b8%aa%e7%b1%bb%e5%a3%b0%e6%98%8e%e4%b8%baspring%e7%9a%84-bean-%e7%9a%84%e6%b3%a8%e8%a7%a3%e6%9c%89%e5%93%aa%e4%ba%9b)
- [Spring中的bean生命周期-一](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_55-spring-%e4%b8%ad%e7%9a%84-bean-%e7%94%9f%e5%91%bd%e5%91%a8%e6%9c%9f)
- [Spring中的bean生命周期-二](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringBean)
- [说说自己对于SpringMVC了解](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_61-%e8%af%b4%e8%af%b4%e8%87%aa%e5%b7%b1%e5%af%b9%e4%ba%8e-spring-mvc-%e4%ba%86%e8%a7%a3)
- [SpringMVC工作原理了解吗](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_62-springmvc-%e5%b7%a5%e4%bd%9c%e5%8e%9f%e7%90%86%e4%ba%86%e8%a7%a3%e5%90%97)
- [Spring框架中用到了哪些设计模型-一](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/SpringInterviewQuestions?id=_7-spring-%e6%a1%86%e6%9e%b6%e4%b8%ad%e7%94%a8%e5%88%b0%e4%ba%86%e5%93%aa%e4%ba%9b%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f%ef%bc%9f)
- [Spring框架中用到了哪些设计模型-二](https://snailclimb.gitee.io/javaguide/#/docs/system-design/framework/spring/Spring-Design-Patterns)
                   
## Mybatis
- [MyBatis-demo](mybatis-demo)
- [MyBatis源码](https://juejin.im/entry/5b9886735188255c960c1bec)
### 面试常见问题
- [MyBatis面试常见问题](/MyBatis框架面试常见问题.md)
- [什么是数据持久化](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E6%95%B0%E6%8D%AE%E6%8C%81%E4%B9%85%E5%8C%96)
- [Mybatis框架简介](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E6%A1%86%E6%9E%B6%E7%AE%80%E4%BB%8B)
- [什么是ORM](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#orm)
- [MyBatis框架的优缺点及其适用的场合](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E6%A1%86%E6%9E%B6%E7%9A%84%E4%BC%98%E7%BC%BA%E7%82%B9%E5%8F%8A%E5%85%B6%E9%80%82%E7%94%A8%E7%9A%84%E5%9C%BA%E5%90%88)
- [MyBatis与Hibernate有哪些不同？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E4%B8%8Ehibernate%E6%9C%89%E5%93%AA%E4%BA%9B%E4%B8%8D%E5%90%8C)
- [#{}和${}的区别是什么？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E5%92%8C%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88)
- [当实体类中的属性名和表中的字段名不一样，怎么办](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E5%BD%93%E5%AE%9E%E4%BD%93%E7%B1%BB%E4%B8%AD%E7%9A%84%E5%B1%9E%E6%80%A7%E5%90%8D%E5%92%8C%E8%A1%A8%E4%B8%AD%E7%9A%84%E5%AD%97%E6%AE%B5%E5%90%8D%E4%B8%8D%E4%B8%80%E6%A0%B7-%E6%80%8E%E4%B9%88%E5%8A%9E-)
- [模糊查询like语句该怎么写?](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E6%A8%A1%E7%B3%8A%E6%9F%A5%E8%AF%A2like%E8%AF%AD%E5%8F%A5%E8%AF%A5%E6%80%8E%E4%B9%88%E5%86%99)
- [这个Dao接口的工作原理是什么？Dao接口里的方法，参数不同时，方法能重载吗？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E9%80%9A%E5%B8%B8%E4%B8%80%E4%B8%AAxml%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E9%83%BD%E4%BC%9A%E5%86%99%E4%B8%80%E4%B8%AAdao%E6%8E%A5%E5%8F%A3%E4%B8%8E%E4%B9%8B%E5%AF%B9%E5%BA%94%E8%AF%B7%E9%97%AE%E8%BF%99%E4%B8%AAdao%E6%8E%A5%E5%8F%A3%E7%9A%84%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88dao%E6%8E%A5%E5%8F%A3%E9%87%8C%E7%9A%84%E6%96%B9%E6%B3%95%E5%8F%82%E6%95%B0%E4%B8%8D%E5%90%8C%E6%97%B6%E6%96%B9%E6%B3%95%E8%83%BD%E9%87%8D%E8%BD%BD%E5%90%97)
- [Mybatis是如何进行分页的？分页插件的原理是什么？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E6%98%AF%E5%A6%82%E4%BD%95%E8%BF%9B%E8%A1%8C%E5%88%86%E9%A1%B5%E7%9A%84%E5%88%86%E9%A1%B5%E6%8F%92%E4%BB%B6%E7%9A%84%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88)
- [Mybatis是如何将sql执行结果封装为目标对象并返回的？都有哪些映射形式？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E6%98%AF%E5%A6%82%E4%BD%95%E5%B0%86sql%E6%89%A7%E8%A1%8C%E7%BB%93%E6%9E%9C%E5%B0%81%E8%A3%85%E4%B8%BA%E7%9B%AE%E6%A0%87%E5%AF%B9%E8%B1%A1%E5%B9%B6%E8%BF%94%E5%9B%9E%E7%9A%84%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%E6%98%A0%E5%B0%84%E5%BD%A2%E5%BC%8F)
- [Mybatis动态sql有什么用？执行原理？有哪些动态sql？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E5%8A%A8%E6%80%81sql%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8%E6%89%A7%E8%A1%8C%E5%8E%9F%E7%90%86%E6%9C%89%E5%93%AA%E4%BA%9B%E5%8A%A8%E6%80%81sql)
- [Mybatis的Xml映射文件中，不同的Xml映射文件，id是否可以重复？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E7%9A%84xml%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E4%B8%AD%E4%B8%8D%E5%90%8C%E7%9A%84xml%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6id%E6%98%AF%E5%90%A6%E5%8F%AF%E4%BB%A5%E9%87%8D%E5%A4%8D)
- [为什么说Mybatis是半自动ORM映射工具？它与全自动的区别在哪里？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%AF%B4mybatis%E6%98%AF%E5%8D%8A%E8%87%AA%E5%8A%A8orm%E6%98%A0%E5%B0%84%E5%B7%A5%E5%85%B7%E5%AE%83%E4%B8%8E%E5%85%A8%E8%87%AA%E5%8A%A8%E7%9A%84%E5%8C%BA%E5%88%AB%E5%9C%A8%E5%93%AA%E9%87%8C)
- [MyBatis实现一对一有几种方式?具体怎么操作的？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E5%AE%9E%E7%8E%B0%E4%B8%80%E5%AF%B9%E4%B8%80%E6%9C%89%E5%87%A0%E7%A7%8D%E6%96%B9%E5%BC%8F%E5%85%B7%E4%BD%93%E6%80%8E%E4%B9%88%E6%93%8D%E4%BD%9C%E7%9A%84)
- [MyBatis实现一对多有几种方式,怎么操作的？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E5%AE%9E%E7%8E%B0%E4%B8%80%E5%AF%B9%E5%A4%9A%E6%9C%89%E5%87%A0%E7%A7%8D%E6%96%B9%E5%BC%8F%E6%80%8E%E4%B9%88%E6%93%8D%E4%BD%9C%E7%9A%84)
- [Mybatis是否支持延迟加载？如果支持，它的实现原理是什么？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E6%98%AF%E5%90%A6%E6%94%AF%E6%8C%81%E5%BB%B6%E8%BF%9F%E5%8A%A0%E8%BD%BD%E5%A6%82%E6%9E%9C%E6%94%AF%E6%8C%81%E5%AE%83%E7%9A%84%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88)
- [Mybatis的一级、二级缓存](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#mybatis%E7%9A%84%E4%B8%80%E7%BA%A7%E4%BA%8C%E7%BA%A7%E7%BC%93%E5%AD%98)
- [什么是MyBatis的接口绑定？有哪些实现方式？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E4%BB%80%E4%B9%88%E6%98%AFmybatis%E7%9A%84%E6%8E%A5%E5%8F%A3%E7%BB%91%E5%AE%9A%E6%9C%89%E5%93%AA%E4%BA%9B%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F)
- [使用MyBatis的mapper接口调用时有哪些要求？](https://github.com/DreamCats/SpringBooks/blob/master/MyBatis%E6%A1%86%E6%9E%B6%E9%9D%A2%E8%AF%95%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98.md#%E4%BD%BF%E7%94%A8mybatis%E7%9A%84mapper%E6%8E%A5%E5%8F%A3%E8%B0%83%E7%94%A8%E6%97%B6%E6%9C%89%E5%93%AA%E4%BA%9B%E8%A6%81%E6%B1%82)
- [mybatis是如何防止SQL注入的](https://zhuanlan.zhihu.com/p/39408398)