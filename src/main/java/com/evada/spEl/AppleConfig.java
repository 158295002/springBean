package com.evada.spEl;

import com.evada.model.Fruit;
import com.evada.xmlConfig.BlackDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author dingqin
 * @date 2017/11/1
 */
@Configuration
@PropertySource("classpath:apple.properties")//这个可以给ev使用
@ImportResource("classpath:springConfig.xml")//这个给spel使用
public class AppleConfig {

    @Autowired
    private Environment ev;

    /**
     * 使用spel的表达式从配置文件读取数据
     * apple这个是springConfig.xml中的id
     * blackDisc这个是xml中配置的bean的ID
     * @param id
     * @return
     */
    @Bean
    public Fruit getApple(@Value("#{apple['aid']}") String id, @Value("#{blackDisc}")BlackDisc disc
                          ){
        Apple apple = new Apple();
        if (id == null) {
            id = ev.getProperty("aid");
            System.out.println(id);
        }
        apple.setName(disc.getArtist());
        apple.setId(id);
        return apple;
    }
}

