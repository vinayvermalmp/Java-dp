package org.example.dp.creational.factoryMethodPattern.exmp2;

public class ChartDisplay {

    public static void main(String[] args) {
        ChartFactory chartFactory = new LineChartFactory();
        Chart chart = chartFactory.getChart();
        chart.display();

        chartFactory = new BarChartFactory();
        chart = chartFactory.getChart();
        chart.display();

        chartFactory = new PieChartFactory();
        chart = chartFactory.getChart();
        chart.display();
    }
}

/*
* Explanation:

The Chart interface defines the methods that the chart classes must implement.

The LineChart, BarChart, and PieChart classes implement the Chart interface and provide their own implementation for the display method.

The ChartFactory is an abstract class that defines the getChart method to be implemented by its subclasses.

The LineChartFactory, BarChartFactory, and PieChartFactory classes extend the ChartFactory class and provide their own implementation for the getChart method, returning the LineChart, BarChart, and PieChart objects, respectively.

In the ChartDisplay class, we create instances of the various chart factories and use them to obtain the chart objects. We then call the display method on each chart object to display the charts.

This implementation uses the Factory Method design pattern to encapsulate the code for generating the chart objects, allowing the client code to obtain the chart objects without having to know the details of how they are created.
* */