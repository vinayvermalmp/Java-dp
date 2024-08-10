package org.example.dp.structural.decorator.examp2;
/*4
* For each type of additional feature, we can create a concrete
* decorator class that adds that feature to the car rental.
* */
public class GPS extends CarDecorator {
    public GPS(Car car) {
        super(car);
    }

    @Override
    public double getRentalCost() {
        return car.getRentalCost() + 5.0; // extra cost of GPS
    }
}
