package org.example.dp.creational.abstractFactoryPattern.exmp3;

public class AmericaRegion extends Region{
    @Override
    CarFactory createCarFactory() {
        return new SedanCarFactory();
    }
}
