package org.example.dp.creational.prototype;

public class Book extends Item {

    private int noOfPages;
    public Book(String title, double price, int noOfPages) {
        super(title, price);
        this.noOfPages = noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
