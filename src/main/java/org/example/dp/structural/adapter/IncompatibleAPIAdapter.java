package org.example.dp.structural.adapter;

/*
* We cannot directly use the IncompatibleAPI class in our project, so we need to
* create an adapter class that implements the API
* interface and adapts the IncompatibleAPI class to our project's needs:
* */
public class IncompatibleAPIAdapter implements API{

    private InCompatibleAPI inCompatibleAPI;

    public IncompatibleAPIAdapter(InCompatibleAPI api){
        this.inCompatibleAPI = api;
    }

    @Override
    public String fetchData() {
        String data = inCompatibleAPI.retrieveData();
        // code to convert the data to the expected format
        // return convertedData;
        return null;
    }
}
