/**
 * @program SpringBooks
 * @description: AOP测试
 * @author: mf
 * @create: 2020/01/30 15:17
 */

package org.example.test;

import org.example.aop.MathCalculate;
import org.example.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculate bean = applicationContext.getBean(MathCalculate.class);
        bean.div(1,1);
    }
}
