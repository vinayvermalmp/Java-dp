package org.example.dp.creational.abstractFactoryPattern;

import java.util.Locale;

public class AfpApplication {
    public static void main(String[] args) {
        PlatformFactory platformFactory = null;
        String plateform = System.getProperty("os.name").toLowerCase();
        if (plateform.contains("windows")) {
            platformFactory = new WindowsFactory();
        } else if (plateform.contains("linux")) {
            platformFactory = new LinuxFactory();
        } else if (plateform.contains("mac")) {
            platformFactory = new MacFactory();
        }

        OS os = platformFactory.createOS();
        os.spec();

    }
}

/*
* Explanation:

The OS interface defines the specification of the different platforms.

The Windows, Linux, and Mac classes implement the OS interface and define the specifications for each platform.

The PlatformFactory is an abstract class that defines a factory method to create objects for different platforms.

The WindowsFactory, LinuxFactory, and MacFactory classes extend the PlatformFactory class and provide concrete implementation of the factory method to create objects for their respective platforms.

In the Application class, we get the current platform using System.getProperty("os.name").toLowerCase() method and create an object of the respective platform factory.

The createOS() method of the respective platform factory is called to create an object of the respective platform, which is then used to call the spec() method to display the specification of the platform.

In this way, the abstract factory design pattern allows creating objects for different platforms in a centralized manner, making the code easy to maintain and extend for future platforms.
* */
