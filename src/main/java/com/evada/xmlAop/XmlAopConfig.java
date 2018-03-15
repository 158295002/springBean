package com.evada.xmlAop;

import com.evada.spEl.AppleConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author dingqin
 * @date 2017/11/3
 */
@Configuration
@ImportResource("classpath:xmlAop.xml")
public class XmlAopConfig {
}
