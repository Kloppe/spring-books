/**
 * @program SpringBooks
 * @description: MybatisConfig
 * @author: mf
 * @create: 2020/02/19 00:53
 */

package com.example.mybatis.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.mybatis.dao")
public class MybatisConfig {
}
