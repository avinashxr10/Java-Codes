package com.java.java8.InterfaceEnhancement.StaticMethod;

public class StaticMethodDemoClass implements StaticMethodDemo{

    public static void main(String[] args) {
        StaticMethodDemoClass obj = new StaticMethodDemoClass();
        StaticMethodDemo.show();
        obj.show();
    }

    public static void show(){
        System.out.println("show method in Static Method Demo Class");
    }
}
