package com.evada.annotationConfig;

import com.evada.model.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dingqin
 * @date 2017/10/9
 */
@Component
public class CDPlayer implements CompactDisc {

    private CompactDisc sp;

    @Autowired(required = false)
    public CDPlayer(SgtPeppers sp) {
        this.sp = sp;
    }

    public void play() {
        if (sp != null){
            sp.play();
        }
        System.out.println("CDPlayer开始演奏啦");
    }
}
