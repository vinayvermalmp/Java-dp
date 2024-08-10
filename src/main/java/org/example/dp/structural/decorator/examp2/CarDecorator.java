package org.example.dp.structural.decorator.examp2;
/*2
* Now we can create a decorator class that adds extra features to a car rental. The decorator class should also implement
* the Car interface and have a reference to an instance of the Car interface.
* */
public abstract class CarDecorator implements Car{
    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    public abstract double getRentalCost();
}
