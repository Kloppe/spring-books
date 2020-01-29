/**
 * @program SpringBooks
 * @description: Value
 * @author: mf
 * @create: 2020/01/29 21:07
 */

package org.example.test;

import org.example.bean.Person;
import org.example.config.MainConfigOfValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Value {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfValue.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }
}
