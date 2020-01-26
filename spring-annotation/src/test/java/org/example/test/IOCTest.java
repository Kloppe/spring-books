/**
 * @program SpringBooks
 * @description: IOC测试
 * @author: mf
 * @create: 2020/01/26 17:31
 */

package org.example.test;

import org.example.bean.Person;
import org.example.config.MainConfig;
import org.example.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
//        for (String definitionName : definitionNames) {
//            System.out.println(definitionName);
//        }
        // 默认是单例的
        Person person = (Person) applicationContext.getBean("person");
        Person person1 = (Person) applicationContext.getBean("person");
        System.out.println(person == person1);
    }
}
