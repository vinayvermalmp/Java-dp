package org.example.dp.creational.prototype.examp3;

public class Client {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("attribute");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        System.out.println(prototype.getAttribute());
        System.out.println(clone.getAttribute());
    }
}

/*
* In this example, we have a ConcretePrototype class that implements the Prototype interface.
*  The clone method returns a new ConcretePrototype object that is identical to the original object.
*  In the Client class, we create an instance of ConcretePrototype and then use the clone method to
*  create a new instance of the object. Both objects have the same attribute value,
* but they are distinct objects, and changes made to one object will not affect the other.
* */
