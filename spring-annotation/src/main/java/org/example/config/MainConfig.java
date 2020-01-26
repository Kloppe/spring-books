/**
 * @program SpringBooks
 * @description: 配置类
 * @author: mf
 * @create: 2020/01/26 17:10
 */

package org.example.config;

import org.example.bean.Person;
import org.springframework.context.annotation.Configuration;

/**
 * 以前是配置文件，现在是配置类... 配置文件==配置类
 */

@Configuration // 告诉spring，这是一个配置文件
public class MainConfig {

    public Person person() {
        return new Person("");
    }
}
