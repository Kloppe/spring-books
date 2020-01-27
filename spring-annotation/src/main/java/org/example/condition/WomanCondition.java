/**
 * @program SpringBooks
 * @description: 女人条件
 * @author: mf
 * @create: 2020/01/27 13:59
 */

package org.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

// 判断女人
public class WomanCondition implements Condition {
    /**
     *
     * @param conditionContext
     * @param annotatedTypeMetadata
     * @return
     */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
    }
}
