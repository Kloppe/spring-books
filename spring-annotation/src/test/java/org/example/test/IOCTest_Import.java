/**
 * @program SpringBooks
 * @description: Import的测试
 * @author: mf
 * @create: 2020/01/28 23:14
 */

package org.example.test;

import org.example.config.MainConfigOfImport;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Import {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfImport.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
