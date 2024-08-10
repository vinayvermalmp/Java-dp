package org.example.dp.creational.abstractFactoryPattern;

public class MacFactory extends PlatformFactory {
    @Override
    OS createOS() {
        return new Mac();
    }
}
