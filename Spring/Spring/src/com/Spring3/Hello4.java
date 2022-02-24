package com.Spring3;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello4 {

    @Autowired(required = false)
    private A aobj;

    @Autowired(required = false)
    private B bobj;

    public void show(){
        System.out.println(aobj);
        System.out.println(bobj);
    }
}
