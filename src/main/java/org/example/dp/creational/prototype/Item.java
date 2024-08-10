package org.example.dp.creational.prototype;


abstract class Item implements Cloneable {
    private String title;
    private double price;

    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
