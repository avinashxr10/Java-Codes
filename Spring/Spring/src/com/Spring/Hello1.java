package com.Spring;

public class Hello1 {
    private A aobj;
    private B bobj;

    public Hello1() {
        System.out.println("Hello1-Default Constructor");
    }

    public void show() {
        System.out.println(aobj);
        System.out.println(bobj);
    }
}
