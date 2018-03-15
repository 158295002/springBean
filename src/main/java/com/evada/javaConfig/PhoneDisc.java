package com.evada.javaConfig;

import com.evada.model.CompactDisc;

/**
 * @author dingqin
 * @date 2017/10/31
 */
public class PhoneDisc implements CompactDisc {

    private String name = "dd";

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name+"手机开始演奏咯。。。");
    }
}
