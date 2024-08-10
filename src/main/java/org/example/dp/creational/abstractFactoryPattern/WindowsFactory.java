package org.example.dp.creational.abstractFactoryPattern;

public class WindowsFactory extends PlatformFactory {
    @Override
    OS createOS() {
        return new Windows();
    }
}
