package org.example.dp.creational.abstractFactoryPattern.exmp3;

public class CarManufacturingApp {

    public static void main(String[] args) {
        Region region = new EurapeRegion();

        CarFactory carFactory = region.createCarFactory();
        Car car = carFactory.createCar();
        car.startEngine();


        Region america = new AmericaRegion();
        Car sedanCar = america.createCarFactory().createCar();
        sedanCar.startEngine();

    }
}

/*
* In this solution, the Car interface defines the basic methods that all car models must implement. The SportsCar and SedanCar classes implement the Car interface.

The CarFactory interface defines the methods that must be implemented by the car factory for each region. The SportsCarFactory and SedanCarFactory classes implement the CarFactory interface.

The Region class is an abstract class that defines the createCarFactory method that must be implemented by the concrete regions. The EuropeRegion and AmericaRegion classes extend the Region class and provide their own implementation of the createCarFactory method.

The CarManufacturingApp class is the main class that creates instances of the EuropeRegion and AmericaRegion classes and uses them to create cars.

With this design, adding a new region is as simple as creating a new concrete class that extends the Region class and provides its own implementation of the createCarFactory method. Changing the models produced by each region is also simple, as it just requires changing the implementation of the createCar method in the corresponding CarFactory implementation.
* */
