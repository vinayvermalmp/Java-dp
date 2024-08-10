package org.example.dp.creational.prototype.exmp2;

import java.util.HashMap;
import java.util.Map;

public class StockPrototype {
    private  static Map<String, Stock> prototypes = new HashMap<>();

    static {
        prototypes.put("FB", new FacebookStock());
        prototypes.put("AMZN", new AmazonStock());
        prototypes.put("GOOGLE", new GoogleStock());
    }

    public static Stock getPrototype(String symbol) {
        return prototypes.get(symbol);
    }
}
