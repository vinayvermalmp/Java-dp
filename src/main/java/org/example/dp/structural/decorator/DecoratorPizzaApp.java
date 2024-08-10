package org.example.dp.structural.decorator;

public class DecoratorPizzaApp {

    public static void main(String[] args) {
        // Finally, we can create an instance of a pizza and add toppings to it as desired.

        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        // pizza = new Pepperoni(pizza);

        // The cost of the pizza can be calculated by calling the getCost() method on the final pizza object.
        double totalCost = pizza.getCost();

        System.out.println(totalCost);
    }
}

/*
This implementation allows us to add extra toppings to a pizza without modifying the original pizza class or its cost calculation.
 It also allows us to add any number of toppings to a pizza in any order.
* */
