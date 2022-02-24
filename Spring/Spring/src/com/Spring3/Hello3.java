package com.Spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello3 {
    private A aobj;
    private B bobj;

    @Autowired
    public Hello3(@Qualifier("ao16") A aobj, @Qualifier("bo16") B bobj) {
        this.aobj = aobj;
        this.bobj = bobj;
    }

    public void show() {
        System.out.println(aobj);
        System.out.println(bobj);
    }
}
