/**
 * @program SpringBooks
 * @description: 生命周期
 * @author: mf
 * @create: 2020/01/27 19:53
 */

package org.example.config;

import org.example.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 生命周期...
 */
@ComponentScan("org.example.bean")
@Configuration
public class MainConfig3 {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }
}
