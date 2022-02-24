package com.java.java8.InterfaceEnhancement.Lambda;

public class VehicleMain {
    public static void main(String[] args) {
        System.out.println("main method");
        VehicleImplementation vehicleImplementation = new VehicleImplementation();
        vehicleImplementation.details();

        Vehicle vehicle = new VehicleImplementation();
        vehicle.details();
    }
}
