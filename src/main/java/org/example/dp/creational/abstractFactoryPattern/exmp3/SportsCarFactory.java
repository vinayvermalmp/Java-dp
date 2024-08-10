package org.example.dp.creational.abstractFactoryPattern.exmp3;

public class SportsCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SportsCar();
    }
}
