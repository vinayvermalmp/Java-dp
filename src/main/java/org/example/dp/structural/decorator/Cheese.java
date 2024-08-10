package org.example.dp.structural.decorator;

/*
* For each type of topping, we can create a concrete decorator class that adds that topping to the pizza.
* */

public class Cheese extends ToppingDecorator{

    public Cheese(Pizza pizza){
        super(pizza);
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 1.0; // extra cost of cheese
    }
}
