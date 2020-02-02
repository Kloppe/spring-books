/**
 * @program SpringBooks
 * @description: ExtConfig
 * @author: mf
 * @create: 2020/02/02 20:50
 */

package org.example.ext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 其实说白了，这些都在给Spring源码讲解做铺垫
 * BeanPostProcessor：bean后置处理器，bean创建对象初始化前后进行拦截工作的
 * 1、BeanFactoryPostProcessor：beanFactory的后置处理器；
 *  在BeanFactory标准初始化之后调用，来定制和修改BeanFactory的内容；
 *  所有的bean定义已经保存加载到beanFactory，但是bean的实例还未创建
 */
@ComponentScan("org.example.ext")
@Configuration
public class ExtConfig {
}
