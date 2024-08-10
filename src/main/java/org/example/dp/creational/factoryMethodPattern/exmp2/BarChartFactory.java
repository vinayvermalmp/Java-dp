package org.example.dp.creational.factoryMethodPattern.exmp2;

public class BarChartFactory extends ChartFactory {
    @Override
    Chart getChart() {
        return new BarChart();
    }
}
