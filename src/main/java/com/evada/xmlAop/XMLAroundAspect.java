package com.evada.xmlAop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author dingqin
 * @date 2017/11/3
 */
public class XMLAroundAspect {

    public void aroundAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("运行前调用");
        proceedingJoinPoint.proceed();
        System.out.println("运行后调用");
    }

}
