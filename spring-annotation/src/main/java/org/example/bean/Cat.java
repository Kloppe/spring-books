/**
 * @program SpringBooks
 * @description: Cat
 * @author: mf
 * @create: 2020/01/27 20:04
 */

package org.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

// 第二种
@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("cat construct...");
    }

    public void destroy() throws Exception {
        System.out.println("cat destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat init ...");
    }
}
