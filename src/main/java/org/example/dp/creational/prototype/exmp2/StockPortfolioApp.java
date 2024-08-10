package org.example.dp.creational.prototype.exmp2;

public class StockPortfolioApp {
    public static void main(String[] args) {
        Stock fbStock = StockPrototype.getPrototype("FB");
        fbStock.setQuantity(100);
        System.out.println(fbStock.toString());

        Stock amzStock = StockPrototype.getPrototype("AMZN");
        amzStock.setQuantity(200);
        System.out.println(amzStock.toString());

        Stock googleStock = StockPrototype.getPrototype("GOOGLE");
        googleStock.setQuantity(300);
        System.out.println(googleStock.toString());
    }

}
/*
* In the example above, we have defined three concrete prototypes for stocks: FacebookStock, AmazonStock, and GoogleStock. The StockPrototype class maintains a map of these prototypes and provides a getPrototype method that returns a clone of the requested prototype.

In the main method, we use the StockPrototype class to get the prototypes for Facebook, Amazon, and Google stocks, and set their respective quantities. Finally, we print the stocks to see the updated quantities.

By using the Prototype design pattern, we can create new instances of stocks efficiently without having to create new objects every time we want to add a stock to the portfolio. The clone method takes care of creating a new object that is a copy of the original, so we can modify the properties of the new object without affecting the original.

This is a real-world use case for the Prototype design pattern, as it is common in the financial industry to have portfolios of stocks with varying quantities. By using the Prototype pattern, we can create a flexible system that allows users to create and manage their custom portfolios with ease.


* */