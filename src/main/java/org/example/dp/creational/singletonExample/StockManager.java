package org.example.dp.creational.singletonExample;

import java.util.HashMap;
import java.util.Map;

// how to implement singletion class in java
public class StockManager {
    private static StockManager instance;
    private Map<String, Integer> stock;

    private StockManager(){
        stock = new HashMap<>();
    }

    public static synchronized StockManager getInstance(){
        if (instance == null){
            instance = new StockManager();
        }
        return instance;
    }

    public Map<String, Integer> getStock(){
        return stock;
    }

    public void updateStock(String product, int quantity){
        stock.put(product, quantity);
    }

}

/*The implementation uses the synchronized keyword on the getInstance method
 to ensure that only one thread can access it at a time. If two threads try
 to access the method simultaneously, the first thread to enter the method will
  lock the class and the second thread will wait until the first thread has
   finished executing the method. This ensures that only one instance of the
   class is created, even if multiple threads try to create an instance simultaneously.

 */
