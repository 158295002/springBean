package com.evada.xmlConfig;

import com.evada.annotationConfig.SgtPeppers;
import com.evada.model.CompactDisc;

import java.util.List;

/**
 * @author dingqin
 * @date 2017/10/18
 */
public class BlackDisc implements CompactDisc {

    private String artist;

    private SgtPeppers sp;

    private List<String> cds;

    private String setArg;

    public BlackDisc(String artist, SgtPeppers sp) {
        this.artist = artist;
        this.sp = sp;
    }

    public String getArtist() {
        return artist;
    }

    public BlackDisc(String artist) {
        this.artist = artist;
    }

    public BlackDisc(String artist, SgtPeppers sp, List<String> cds) {
        this.artist = artist;
        this.sp = sp;
        this.cds = cds;
    }

    public void setSetArg(String setArg) {
        this.setArg = setArg;
    }

    public void play() {
        System.out.println(artist+"开始演奏了！");
        if (sp != null){
            sp.play();
        }
        for(String str:cds){
            System.out.println("演奏的顺序是："+str);
        }

        System.out.println("setArg:"+setArg);
    }
}
