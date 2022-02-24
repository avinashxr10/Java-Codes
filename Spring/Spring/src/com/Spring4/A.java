package com.Spring4;

import javax.annotation.PostConstruct;

public class A {
    static {
        System.out.println("A - static Block");
    }

    private int a;
    private String msg;

    public A() {
        System.out.println("A - Default Constructor");
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @PostConstruct
    public void init() {
        System.out.println("A - init()");
    }

    @Override
    public String /**/toString() {
        return "A{" +
                "a=" + a +
                ", msg='" + msg + '\'' +
                '}';
    }
}
