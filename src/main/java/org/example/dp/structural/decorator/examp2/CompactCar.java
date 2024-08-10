package org.example.dp.structural.decorator.examp2;
/*2
* Next, we can create concrete implementations of the Car interface that represent different types of cars.
* */
public class CompactCar implements Car{
    @Override
    public double getRentalCost() {
        return 30.0; // rental cost of a compact car
    }
}
