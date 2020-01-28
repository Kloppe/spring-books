/**
 * @program SpringBooks
 * @description: 作用域
 * @author: mf
 * @create: 2020/01/28 22:56
 */

package org.example.test;

import org.example.bean.Person;
import org.example.config.MainConfigOfScope;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Scope {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfScope.class);
        Person bean = applicationContext.getBean(Person.class);
        Person bean1 = applicationContext.getBean(Person.class);
        System.out.println(bean == bean1);
    }
}
