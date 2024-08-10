package org.example.dp.structural.decorator.examp2;

public class LuxuryCar implements Car{
    @Override
    public double getRentalCost() {
        return 100.0; // rental cost of a compact car
    }
}
