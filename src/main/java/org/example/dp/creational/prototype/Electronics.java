package org.example.dp.creational.prototype;

public class Electronics extends Item{

    private String model;
    public Electronics(String title, double price, String model) {
        super(title, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
   @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
