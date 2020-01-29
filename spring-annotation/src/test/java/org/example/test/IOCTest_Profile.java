/**
 * @program SpringBooks
 * @description: Profile
 * @author: mf
 * @create: 2020/01/29 22:08
 */

package org.example.test;

import org.example.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class IOCTest_Profile {
    //1、使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
    //2、代码的方式激活某种环境；

    @Test
    public void test() {
        //1、创建一个applicationContext
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //2、设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        //3、注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4、启动刷新容器
        applicationContext.refresh();
        String[] names = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
