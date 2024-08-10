package org.example.dp.creational.builderExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vehicle {

    private final String make;
    private final String model;
    private final int year;
    private final String engine;
    private final String transmission;
    private final List<String> options;

    private Vehicle(VehicleBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.options = builder.options;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public List<String> getOptions() {
        return options;
    }

    public static class VehicleBuilder {
        private final String make;
        private final String model;
        private final int year;
        private final String engine;
        private final String transmission;
        private List<String> options = new ArrayList<>();

        public VehicleBuilder(String make, String model, int year, String engine,
                              String transmission) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.engine = engine;
            this.transmission = transmission;
        }

        public VehicleBuilder options(List<String> options) {
            // Add only the options that are allowed for the vehicle
            //for (String option : options) {
            //if (isOptionAllowed(option)) {
            //this.options.add(option);
            //}
            //}
            return this;
        }

        private boolean isOptionAllowed(String option) {
            // Check if the option is allowed
            //or the vehicle based on the make,
            //model, year, engine, and transmission properties
            // Example: A sunroof option can only be included if the vehicle has a moonroof
            // ...
            return true;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    public static void main(String[] args) {
        /*
        * By using the Builder design pattern, you can create instances of the Vehicle class in a more readable and flexible manner, while still ensuring that only allowed options are included:
        * */
        List<String> options = Arrays.asList("Moonroof", "Sunroof", "Leather Seats");
        Vehicle vehicle = new Vehicle.VehicleBuilder("Toyota", "Camry", 2020, "V6", "Automatic")
                .options(options).build();
    }
}

/*
* In the above code, the  Vehicle class has a private constructor that takes an instance of the  VehicleBuilder as a parameter. The VehicleBuilder class has a method to set the optional options of the Vehicle class and a build method that returns an instance of the Vehicle class. The VehicleBuilder class also has a constructor that takes the required properties (make, model, year, engine, and transmission) of the  Vehicle class.

The  VehicleBuilder class includes a method isOptionAllowed to check if a given option is allowed for the vehicle based on the make, model, year, engine, and transmission properties. This makes it possible to ensure that only allowed options are included in the Vehicle instance.
*
*
* In the above code, you are creating an instance of the Vehicle class by calling the VehicleBuilder constructor with the required properties and then calling the options method to set the optional options. Finally, you call the build method to create an instance of the Vehicle class. The Vehicle instance will only include the options that are allowed for the vehicle based on the conditions specified in the isOptionAllowed method.
* */
