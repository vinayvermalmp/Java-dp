package org.example.dp.creational.abstractFactoryPattern.exmp2;

public class CasualClothesFactory implements ClothesFactory{
    @Override
    public Clothes createShirt() {
        return new CasualShirt();
    }

    @Override
    public Clothes createPaint() {
        return new CasualPaint();
    }
}
