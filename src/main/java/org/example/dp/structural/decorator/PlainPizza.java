package org.example.dp.structural.decorator;
/*
* 2 Next, we can create a concrete implementation of the Pizza interface that represents a plain pizza.
* */
public class PlainPizza implements Pizza{
    @Override
    public double getCost() {
        return 10.0; // base cost of pizza
    }
}
