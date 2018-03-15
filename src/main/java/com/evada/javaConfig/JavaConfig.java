package com.evada.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * @author dingqin
 * @date 2017/10/31
 */
@Configuration
@PropertySource("classpath:phoneProperties.properties")
public class JavaConfig {

    @Autowired
    private Environment ev;

    @Bean
    @PhoneDiscQualifer
    @Conditional(PhoneDiscCondition.class)//设置条件，只有满足条件才会创建该bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//设置创建实例的范围
    public PhoneDisc getPhone(){
        PhoneDisc pd = new PhoneDisc();
        pd.setName(ev.getProperty("name"));//name值从phoneProperties.properties文件中读取
        return pd;
    }
}
