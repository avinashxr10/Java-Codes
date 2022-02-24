package com.Spring3;

import org.springframework.beans.factory.annotation.Required;

public class Hello5 {
    private A aobj;
    private B bobj;

    @Required
    public void setAobj(A aobj) {
        System.out.println("Hello5 - setAobj");
        this.aobj = aobj;
    }

    @Required
    public void setBobj(B bobj) {
        System.out.println("Hello5 - setBobj");
        this.bobj = bobj;
    }

    public void show(){
        System.out.println(aobj);
        System.out.println(bobj);
    }
}
