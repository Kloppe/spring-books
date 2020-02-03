/**
 * @program SpringBooks
 * @description: HelloWorldController
 * @author: mf
 * @create: 2020/02/03 12:25
 */

package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController:品一下这个注解
 * 主要是包含这两个注解
 *  1. @Controller
 *  2. @ResponseBody:若是使用rest的风格，主要是要带上这个注解
 */
@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
}
