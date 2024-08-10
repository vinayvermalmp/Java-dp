package org.example.dp.creational.factoryMethodPattern;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("scooter")) {
            return new Scooter();
        }
        return null;
    }
}

/*
* Explanation:

The Vehicle class is an abstract class that defines the properties of a vehicle. The Car, Bike, and Scooter classes are concrete implementations of the Vehicle class, each with its own set of properties. The VehicleFactory class has a createVehicle method that takes a type parameter and returns an object of the appropriate type of vehicle based on the value of the type parameter. The Factory Method design pattern is used to create objects of different types without exposing the creation logic to the client, allowing the client to use a single interface to create objects of different types.
* */

