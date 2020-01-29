/**
 * @program SpringBooks
 * @description: person bean
 * @author: mf
 * @create: 2020/01/26 16:44
 */

package org.example.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("Maifeng")
    private String name;

    @Value("#{20-2}")
    private Integer age;

    @Value("${person.nickName}")
    private String nickName;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
