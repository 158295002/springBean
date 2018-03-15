package com.evada.annotationAop;

import com.evada.spEl.AppleConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @author dingqin
 * @date 2017/11/2
 */
@Configuration
@EnableAspectJAutoProxy
@Import(AppleConfig.class)
public class AopConfig {

    @Bean
    public FruitAspect getFruitAspect(){
        return new FruitAspect();
    }

    @Bean
    public AroundAspect getAroundAspect(){
        return new AroundAspect();
    }
}
