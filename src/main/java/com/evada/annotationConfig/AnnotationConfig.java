package com.evada.annotationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dingqin
 * @date 2017/10/9
 */
@Configuration
//@ComponentScan(basePackages = {"com.evada.model"})//写法1 javaConfig
@ComponentScan(basePackageClasses = {SgtPeppers.class, CDPlayer.class})//写法2 //javaConfig
public class AnnotationConfig {
}
