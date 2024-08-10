package org.example.dp.structural.adapter.examp2;

/*
* To use the Adapter design pattern in this scenario, we need to create an adapter class that acts as a bridge between the different protocols used by the external systems and our project. Here's how we can implement this in Java:

First, let's create an interface that defines the common functionality that all protocols must implement:
* */
public interface Protocol {
    public void sendData(byte[] data);
    public byte[] receiveData();
}
