package org.example.dp.structural.decorator.examp2;

public class ChildSeat extends CarDecorator{
    public ChildSeat(Car car) {
        super(car);
    }

    @Override
    public double getRentalCost() {
        return car.getRentalCost() + 10.0; // extra cost of child seat
    }
}
