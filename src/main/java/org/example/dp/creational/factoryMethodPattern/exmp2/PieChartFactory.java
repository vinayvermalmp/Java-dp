package org.example.dp.creational.factoryMethodPattern.exmp2;

class PieChartFactory extends ChartFactory {
    @Override
    Chart getChart() {
        return new PieChart();
    }
}