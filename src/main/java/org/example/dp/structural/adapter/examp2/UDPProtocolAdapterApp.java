package org.example.dp.structural.adapter.examp2;
/*
* In the UDPProtocolAdapter class, we store an instance of the UDPProtocol class and implement the sendData() and receiveData() methods from the Protocol interface. In the sendData() method, we convert the data to the UDP format before sending it using the UDPProtocol object. In the receiveData() method, we retrieve the data from the UDPProtocol object and convert it to the expected format before returning it.

Now we can use both the TCPProtocol and UDPProtocolAdapter classes in our project using the common Protocol interface:
* */
public class UDPProtocolAdapterApp {
    public static void main(String[] args) {
        Protocol protocol1 = new TCPPortocol();
        Protocol protocol2 = new UDPProtocolAdapter(new UDPProtocol());

        byte[] data = null ; // data to send

        protocol1.sendData(data);
        byte[] receivedData = protocol2.receiveData();
    }
}
