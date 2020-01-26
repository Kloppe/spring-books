/**
 * @program SpringBooks
 * @description: MainConfig2
 * @author: mf
 * @create: 2020/01/26 17:44
 */

package org.example.config;

import org.example.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig2 {

    // prototype 多实例 IOC启动，并不会调用该方法创建对象放到容器中，而是去获取的时候才去调用方法创建对象
    // singleton 单实例（默认值） IOC启动，默认创建该方法放到容器中
    @Scope("")
    @Bean
    public Person person() {
        System.out.println("给容器中创建person...");
        return new Person();
    }
}
