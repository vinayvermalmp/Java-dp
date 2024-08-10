package org.example.dp.structural.adapter;

/*
* In the IncompatibleAPIAdapter class, we store an instance of the IncompatibleAPI class
* and implement the fetchData() method from the API interface. In the fetchData() method, we retrieve the data from
* the IncompatibleAPI object and convert it to the expected format before returning it.
* */
public class ApapterPatternApp {
    public static void main(String[] args) {
        // In the IncompatibleAPIAdapter class, we store an instance of the IncompatibleAPI class and implement the fetchData() method from the API interface. In the fetchData() method, we retrieve the data from the IncompatibleAPI
        // object and convert it to the expected format before returning it.
        API api1 = new CompatibleAPI();
        API api2 = new IncompatibleAPIAdapter(new InCompatibleAPI());

        String data1 = api1.fetchData();
        String data2 = api2.fetchData();
    }
}
