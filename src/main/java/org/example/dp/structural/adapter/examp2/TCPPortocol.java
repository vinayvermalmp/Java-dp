package org.example.dp.structural.adapter.examp2;

/*
Next, let's create two concrete protocol classes, one that uses the TCP protocol
and one that uses the UDP protocol:
* */
public class TCPPortocol implements Protocol{
    @Override
    public void sendData(byte[] data) {
        // code to send data using TCP
    }

    @Override
    public byte[] receiveData() {
        // code to receive data using TCP
        return null;
    }
}
