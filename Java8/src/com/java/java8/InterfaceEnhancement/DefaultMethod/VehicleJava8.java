package com.java.java8.InterfaceEnhancement.DefaultMethod;

public interface VehicleJava8 {

    default void details(){
        System.out.println("I am Java 8 default method");
    }

    void mileage();
}
