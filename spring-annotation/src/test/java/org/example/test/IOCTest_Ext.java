/**
 * @program SpringBooks
 * @description: Ext测试
 * @author: mf
 * @create: 2020/02/02 20:54
 */

package org.example.test;

import org.example.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Ext {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        applicationContext.close();
    }
}
