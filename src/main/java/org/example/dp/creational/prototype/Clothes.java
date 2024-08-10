package org.example.dp.creational.prototype;

public class Clothes extends  Item {

    private String size;
    public Clothes(String title, double price, String size) {
        super(title, price);
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void  setSize(String size){
        this.size = size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
