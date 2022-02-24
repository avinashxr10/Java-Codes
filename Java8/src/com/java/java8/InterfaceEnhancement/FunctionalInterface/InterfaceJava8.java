package com.java.java8.InterfaceEnhancement.FunctionalInterface;

@FunctionalInterface
public interface InterfaceJava8 {
    public void show(); //only 1 abstract method in Functional Interface

    public default void details(){

    }
    public static String enquires(){
        return "Functional Interface";
    }
}
