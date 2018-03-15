package com.evada.spEl;

import com.evada.model.Fruit;
import org.springframework.stereotype.Component;

/**
 * @author dingqin
 * @date 2017/11/1
 */
@Component
public class Apple implements Fruit {

    private String name;

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wash() {
        System.out.println(String.format("%s洗第%s个苹果啦。。。",name,id));
    }

    public void wash(String str) {
        System.out.println("洗苹果"+str);
    }
}
