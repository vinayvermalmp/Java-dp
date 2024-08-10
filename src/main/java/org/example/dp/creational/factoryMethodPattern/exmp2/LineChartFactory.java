package org.example.dp.creational.factoryMethodPattern.exmp2;

public class LineChartFactory extends ChartFactory {
    @Override
    Chart getChart() {
        return new LineChart();
    }
}
