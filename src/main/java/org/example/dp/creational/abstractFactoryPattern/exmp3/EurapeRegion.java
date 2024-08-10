package org.example.dp.creational.abstractFactoryPattern.exmp3;

public class EurapeRegion extends Region{
    @Override
    CarFactory createCarFactory() {
        return new SportsCarFactory();
    }
}
