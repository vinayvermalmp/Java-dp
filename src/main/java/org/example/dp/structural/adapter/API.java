package org.example.dp.structural.adapter;

/*
* To use the Adapter design pattern, we need to create an adapter class that acts as a bridge between the incompatible API and the rest of the project. Here's how we can implement this in Java:

First, let's create an interface that defines the common functionality that all APIs must implement:
* */
public interface API {
    public String fetchData();
}
