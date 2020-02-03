package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication： 这个注解，需要细品，项目启动的入口呀
 * 主要是三个注解：
 *  1. @SpringBootConfiguration:允许在上下文中注册额外的bean或导入其他配置类。
 *  2. @EnableAutoConfiguration:启用 SpringBoot 的自动配置机制
 *      根据我的猜测，估计是ImportSelect导入组件：AutoConfigurationImportSelector，可以点进去看看
 *  3. @ComponentScan: 扫描常用的注解
 */
@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
