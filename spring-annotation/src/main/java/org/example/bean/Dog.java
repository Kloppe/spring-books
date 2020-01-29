/**
 * @program SpringBooks
 * @description: Dog
 * @author: mf
 * @create: 2020/01/27 20:11
 */

package org.example.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// 第三种
@Component
public class Dog {

    public Dog() {
        System.out.println("dog construct...");
    }

    // 对象创建并赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("dog init ...");
    }

    // 对象在销毁之前会调用
    @PreDestroy
    public void destroy() {
        System.out.println("dog destroy...");
    }
}
