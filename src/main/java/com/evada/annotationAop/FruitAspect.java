package com.evada.annotationAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 作为Fruit.wash(..)的切面
 * @author dingqin
 * @date 2017/11/2
 */
@Aspect
public class FruitAspect {

    @Pointcut("execution(* com.evada.model.Fruit.wash(..))")
    public void washPoint(){};

    @Before("washPoint()")//或者直接写 @Before("execution(* com.evada.model.Fruit.wash(..))")
    public void prepareFruit() {
        System.out.println("FruitAspect准备些水果");
    }

    @After("washPoint()")
    public void eatFruit(){
        System.out.println("FruitAspect开始吃水果");
    }
}
