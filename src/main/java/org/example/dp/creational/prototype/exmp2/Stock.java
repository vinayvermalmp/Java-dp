package org.example.dp.creational.prototype.exmp2;

abstract class Stock implements Cloneable {
    protected String name;
    protected String symbol;
    protected int quantity;

    public Stock(String name, String symbol, int quantity) {
        this.name = name;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected Stock clone() {
        try {
            return (Stock) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Stock [name=" + name + ", symbol=" + symbol + ", quantity=" + quantity + "]";
    }
}
