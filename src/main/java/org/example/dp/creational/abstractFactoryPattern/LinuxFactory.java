package org.example.dp.creational.abstractFactoryPattern;

public class LinuxFactory extends PlatformFactory {
    @Override
    OS createOS() {
        return  new Linux();
    }
}
