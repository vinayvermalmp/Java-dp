package org.example.dp.structural.decorator.examp2;

public class CarRentalApp {
    public static void main(String[] args) {
       // Finally, we can create an instance of a car and add additional features to it as desired.

        Car car = new LuxuryCar();
        car = new GPS(car);
        car = new ChildSeat(car);

       // The total cost of the car rental can be calculated by calling the getRentalCost() method on the final car object.

        double totalCost = car.getRentalCost();

        System.out.println(totalCost);

        Car car1 = new CompactCar();
        car1 = new GPS(car1);
        car1 = new ChildSeat(car1);
        double totalRentalCost = car1.getRentalCost();

        System.out.println(totalRentalCost);
    }
}

/*
* This implementation allows us to add additional features to a car rental without modifying the original car class or
* its rental cost calculation. It also allows us to add any number of features to a car rental in any order.
* */
