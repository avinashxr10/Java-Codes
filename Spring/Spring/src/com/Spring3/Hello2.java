package com.Spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello2 {

    @Autowired
    @Qualifier("ao11")
    private A aobj;

    @Autowired
    @Qualifier("bo2")
    private B bobj;

    public void show(){
        System.out.println(aobj);
        System.out.println(bobj);
    }
}
