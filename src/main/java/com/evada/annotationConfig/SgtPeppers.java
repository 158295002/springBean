package com.evada.annotationConfig;

import com.evada.model.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @author dingqin
 * @date 2017/10/9
 */
@Component//标注为组件，让spring自动去扫描，并创建一个bean
public class SgtPeppers implements CompactDisc {

    public void play() {
        System.out.println("SgtPeppers开始弹奏!");
    }
}
