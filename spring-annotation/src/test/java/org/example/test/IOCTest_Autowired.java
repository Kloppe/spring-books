/**
 * @program SpringBooks
 * @description: Autowired
 * @author: mf
 * @create: 2020/01/29 21:25
 */

package org.example.test;

import org.example.config.MainConfigOfAutowired;
import org.example.controller.BookController;
import org.example.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Autowired {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        BookController bean = applicationContext.getBean(BookController.class);
        System.out.println(bean);
    }
}
