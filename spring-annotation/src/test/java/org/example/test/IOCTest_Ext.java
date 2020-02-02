/**
 * @program SpringBooks
 * @description: Ext测试
 * @author: mf
 * @create: 2020/02/02 20:54
 */

package org.example.test;

import org.example.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Ext {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        // 发布事件
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
        });
        applicationContext.close();
    }
}
