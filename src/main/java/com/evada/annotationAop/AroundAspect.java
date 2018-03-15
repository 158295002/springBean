package com.evada.annotationAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 环绕切面
 * @author dingqin
 * @date 2017/11/2
 */
@Aspect
public class AroundAspect {

    @Pointcut("execution(* com.evada.model.Fruit.wash(..))")
    public void aroundWashPoint(){};

    @Around("aroundWashPoint()")
    public void aroundWash(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("AroundAspect先准备些水果。。。");
        proceedingJoinPoint.proceed();//调用被通知的方法  wash()
        System.out.println("AroundAspect洗完就可以吃啦");
    }

}
