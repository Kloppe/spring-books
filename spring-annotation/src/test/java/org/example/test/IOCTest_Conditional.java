/**
 * @program SpringBooks
 * @description: Conditional的测试
 * @author: mf
 * @create: 2020/01/28 23:07
 */

package org.example.test;

import org.example.config.MainConfigOfConditional;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Conditional {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfConditional.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
