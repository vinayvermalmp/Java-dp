package org.example.dp.creational.abstractFactoryPattern.exmp2;

public class FormalClothesFactory implements ClothesFactory{
    @Override
    public Clothes createShirt() {
        return new FormalShirt();
    }

    @Override
    public Clothes createPaint() {
        return new CasualPaint();
    }
}
