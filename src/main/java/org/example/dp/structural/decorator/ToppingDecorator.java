package org.example.dp.structural.decorator;
/* 3
* Now we can create a decorator class that adds extra toppings to a pizza.
* The decorator class should also implement the
* Pizza interface and have a reference to an instance of the Pizza interface.
* */
public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    public abstract double getCost();
}
