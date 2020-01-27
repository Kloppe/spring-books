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

import java.util.Map;

public class IOCTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void test01() {

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
    }

    @Test
    public void test02() {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
//        for (String definitionName : definitionNames) {
//            System.out.println(definitionName);
//        }
        System.out.println("IOC容器创建完成");
        // 默认是单例的
//        Person person = (Person) applicationContext.getBean("person");
//        Person person1 = (Person) applicationContext.getBean("person");
//        System.out.println(person == person1);
    }

    @Test
    public void test03() {
//        String[] definitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            System.out.println(name);
//        }
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }

        Map<String, Person> personMap = applicationContext.getBeansOfType(Person.class);
        System.out.println(personMap);
    }

    private void printBeanNames() {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void testImport() {
        printBeanNames();
    }
}
