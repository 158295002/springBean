package com.evada.javaAopConfig;

import com.evada.javaAopConfig.model.Car;
import com.evada.javaAopConfig.model.SmallCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author dingqin
 * @date 2017/11/23
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {CarAspect.class})
public class JavaConfig {

    @Bean
    public Car car(){
        return new SmallCar();
    }
}
