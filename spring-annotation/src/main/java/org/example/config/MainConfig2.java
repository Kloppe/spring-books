/**
 * @program SpringBooks
 * @description: MainConfig2
 * @author: mf
 * @create: 2020/01/26 17:44
 */

package org.example.config;

import org.example.bean.Color;
import org.example.bean.Person;
import org.example.condition.ManCondition;
import org.example.condition.WomanCondition;
import org.springframework.context.annotation.*;

@Configuration
@Import(Color.class)
public class MainConfig2 {

    // prototype 多实例 IOC启动，并不会调用该方法创建对象放到容器中，而是去获取的时候才去调用方法创建对象
    // singleton 单实例（默认值） IOC启动，默认创建该方法放到容器中
    // 懒加载 容器启动的时候不创建对象，第一次获取的时候才去创建对象并初始化（单实例）
    @Scope("")
    @Lazy
    @Bean("isMan")
    public Person person() {
        System.out.println("给容器中创建person...");
        return new Person();
    }

    /**
     * @conditional: 按照一定的条件进行判断，满足条件给容器中注册bean
     * @return
     *
     * 如果是man，给容器注册maifeng，如果是woman，给容器注册liumeng
     */
    @Conditional({ManCondition.class})
    @Bean("man")
    public Person person01() {
        return new Person("Maifeng", 18);
    }

    @Conditional({WomanCondition.class})
    @Bean("woman")
    public Person person02() {
        return new Person("Liumeng", 18);
    }

    /**
     * @import 方式快速导入组件
     */
}
