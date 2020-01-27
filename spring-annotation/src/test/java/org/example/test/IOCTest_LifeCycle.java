/**
 * @program SpringBooks
 * @description: 生命周期测试
 * @author: mf
 * @create: 2020/01/27 19:56
 */

package org.example.test;

import org.example.config.MainConfig3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void test01() {
        // 1. 创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
        System.out.println("ioc 容器创建完成...");
        // 2. ioc容器关闭
        applicationContext.close();
    }
}
