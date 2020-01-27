/**
 * @program SpringBooks
 * @description: 男人条件
 * @author: mf
 * @create: 2020/01/27 13:59
 */

package org.example.condition;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

// 判断是否是男人条件
public class ManCondition implements Condition {

    /**
     *
     * @param conditionContext:上下文环境
     * @param annotatedTypeMetadata:注解的注释信息
     * @return
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 判断是否男人
        return false;
    }
}
