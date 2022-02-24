package com.Spring3;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello1 {
    private A aobj;
    private B bobj;

    @Autowired
    public Hello1(A aobj,B bobj){
        this.aobj = aobj;
        this.bobj = bobj;
    }
    public void show(){
        System.out.println(aobj);
        System.out.println(bobj);
    }
}
