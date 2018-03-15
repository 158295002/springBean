package com.evada.javaAopConfig.model;

import com.evada.javaAopConfig.model.Car;
import org.springframework.stereotype.Component;

/**
 * @author dingqin
 * @date 2017/11/23
 */
public class SmallCar implements Car {

    public void run() {
        System.out.println("小车开始跑啦。。。。。");
    }

    public void refuel() {
        System.out.println("加油咯。。。。。");
    }
}
