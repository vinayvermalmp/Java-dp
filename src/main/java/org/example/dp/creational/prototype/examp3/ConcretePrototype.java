package org.example.dp.creational.prototype.examp3;

public class ConcretePrototype implements Prototype{

    private String attribute;

    public ConcretePrototype(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.attribute);
    }

    public String getAttribute(){
        return attribute;
    }
}
