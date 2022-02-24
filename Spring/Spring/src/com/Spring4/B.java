package com.Spring4;

import javax.annotation.PostConstruct;

public class B {
    static {
        System.out.println("B - Static Block");
    }

    private int b;
    private String str;

    public B() {
        System.out.println("B() - Default Constructor");
    }

    public B(int b, String str) {
        System.out.println("B-(int,String)");
        this.b = b;
        this.str = str;
    }

    @PostConstruct
    public void init() {
        System.out.println("B - init()");
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", str='" + str + '\'' +
                '}';
    }
}
