/**
 * @program SpringBooks
 * @description: MainConfig2
 * @author: mf
 * @create: 2020/01/26 17:44
 */

package org.example.config;

import org.example.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig2 {

    @Bean
    public Person person() {
        return new Person();
    }
}
