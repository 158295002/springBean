package com.evada.javaAopConfig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author dingqin
 * @date 2017/11/23
 */
@Aspect
@Component
public class CarAspect {

    /**
     * 针对该包下的所有类的所有方法都进行切面处理（这个操作不能将该类和需要拦截的类放在同一个包下，否则这些方法也会被拦截就会报错了）
     */
    @Pointcut("execution(* com.evada.javaAopConfig.model.*.*(..))")
    public void executePoit(){};


    @Around("executePoit()")
    public void aroundCar(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("方法调用前。。");
        proceedingJoinPoint.proceed();
        System.out.println("方法调用后\n");
    }

    @Pointcut("execution(* com.evada.javaAopConfig.model.Car.refuel(..))")
    public void refuelPoint(){}

    @Before("refuelPoint()")
    public void beforeRefuel(){
        System.out.println("加油前，钱带够了么。。。。。");
    }

    @After("execution(* com.evada.javaAopConfig.model.Car.run(..))")
    public void afterRun(){
        System.out.println("high完赶紧回家咯。。。。。");
    }

}
