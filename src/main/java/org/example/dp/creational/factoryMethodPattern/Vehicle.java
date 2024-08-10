package org.example.dp.creational.factoryMethodPattern;

public abstract class Vehicle {
    private int capacity;
    private double fuelEfficiency;
    private double rentalCost;

    public Vehicle(int capacity, double fuelEfficiency, double rentalCost) {
        this.capacity = capacity;
        this.fuelEfficiency = fuelEfficiency;
        this.rentalCost = rentalCost;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getRentalCost() {
        return rentalCost;
    }
}