package com.evada.javaConfig;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * 条件化的bean
 * @author dingqin
 * @date 2017/10/31
 */
public class PhoneDiscCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //可以设置一些条件
        String name = context.getEnvironment().getProperty("name");
        System.out.println(name);
       return true;
    }
}
