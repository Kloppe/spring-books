/**
 * @program SpringBooks
 * @description: Car
 * @author: mf
 * @create: 2020/01/27 19:53
 */

package org.example.bean;

public class Car {

    public Car() {
        System.out.println("car create...");
    }

    public void init() {
        System.out.println("car init ...");
    }

    public void destroy() {
        System.out.println("car destroy...");
    }
}
