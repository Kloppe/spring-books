/**
 * @program SpringBooks
 * @description: 事务测试
 * @author: mf
 * @create: 2020/02/02 00:20
 */

package org.example.test;

import org.example.tx.MainConfigOfTx;
import org.example.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_tx {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfTx.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
    }
}
