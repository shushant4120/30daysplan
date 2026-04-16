package com.prepration.concept.designpattern.factorypattern;

public class VehicleFactory {
   // Factory method to create vehicles based on type 
   public static Vehicle getVehicle(String type) {
        if (type.equals("car")) return new Car();
        if (type.equals("bike")) return new Bike();
        return null;
    }
}
