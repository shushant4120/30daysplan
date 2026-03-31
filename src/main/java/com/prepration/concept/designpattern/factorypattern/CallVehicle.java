package com.prepration.concept.designpattern.factorypattern;

public class CallVehicle {
    
    public static void main(String[] args) {
        Vehicle car= VehicleFactory.getVehicle("car");
        car.drive();
        VehicleFactory.getVehicle("bike").drive();
    }
}
