package org.example.dp.creational.abstractFactoryPattern.exmp3;

public class SedanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SedanCar();
    }
}
