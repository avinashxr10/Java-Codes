package com.Spring3;

public class B {
    private int b;
    private String str;

    public B(int b, String str) {
        this.b = b;
        this.str = str;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", str='" + str + '\'' +
                '}';
    }
}
