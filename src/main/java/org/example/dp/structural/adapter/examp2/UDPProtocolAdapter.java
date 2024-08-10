package org.example.dp.structural.adapter.examp2;

/*
* We cannot directly use the UDPProtocol class in our project since it does not implement the Protocol interface,
* so we need to create an adapter class that adapts the UDPProtocol class to our project's needs:
* */
public class UDPProtocolAdapter implements Protocol {
    private UDPProtocol protocol;

    public UDPProtocolAdapter(UDPProtocol protocol) {
        this.protocol = protocol;
    }

    public void sendData(byte[] data) {
        // code to convert the data to the UDP format
        //byte[] udpData = convertedData;
        //protocol.sendData(udpData);
    }

    public byte[] receiveData() {
        byte[] udpData = protocol.receiveData();
        // code to convert the data to the expected format
        //byte[] convertedData = convertedData;
        //return convertedData;
        return null;
    }
}
