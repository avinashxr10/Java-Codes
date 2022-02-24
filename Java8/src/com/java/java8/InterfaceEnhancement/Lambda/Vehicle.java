package com.java.java8.InterfaceEnhancement.Lambda;

@FunctionalInterface
public interface Vehicle {
    void details();

    default void getMileage(){
        System.out.println("Showing mileage details");
    }
}
