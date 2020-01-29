/**
 * @program SpringBooks
 * @description: 生命周期测试
 * @author: mf
 * @create: 2020/01/29 14:13
 */

package org.example.test;

import org.example.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        applicationContext.close();
    }
}
