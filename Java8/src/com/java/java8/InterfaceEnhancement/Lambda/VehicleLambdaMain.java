package com.java.java8.InterfaceEnhancement.Lambda;

public class VehicleLambdaMain {
    public static void main(String[] args) {
        Vehicle vehicle = ()->{System.out.println("Vehicle details from lambda");};
        vehicle.details();

        Calculator calculator = (Integer a, Integer b) ->{return a+b;};
        Integer result = calculator.add(5,7);
        System.out.println(result);

        Calculator calculator2 = (Integer a, Integer b) -> a+b;
        Integer result2 = calculator2.add(5,7);
        System.out.println(result2);
    }

    public void multiply(){
        System.out.println("I am a normal function");
    }
}
