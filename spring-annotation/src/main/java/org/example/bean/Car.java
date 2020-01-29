/**
 * @program SpringBooks
 * @description: Car
 * @author: mf
 * @create: 2020/01/27 19:53
 */

package org.example.bean;
// 第一种
public class Car {

    public Car() {
        System.out.println("car construct...");
    }

    public void init() {
        System.out.println("car init ...");
    }

    public void destroy() {
        System.out.println("car destroy...");
    }
}
