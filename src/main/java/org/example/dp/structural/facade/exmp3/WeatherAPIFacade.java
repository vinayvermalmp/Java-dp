package org.example.dp.structural.facade.exmp3;
/*
* One way to simplify the interactions with the API and provide a simple interface to the client code is by using the Facade design pattern. In this pattern, a Facade class is created that acts as a single point of contact for the client code. The Facade class provides a simple, easy-to-use interface for the client code, while handling the interactions with the API behind the scenes.

For example, you could create a WeatherAPIFacade class that provides methods for retrieving weather data for a location. The WeatherAPIFacade class would encapsulate the complex authentication process and the multiple steps involved in retrieving the data.

Here is some sample code to illustrate the implementation of the Facade pattern:
* */
public class WeatherAPIFacade {
    private WeatherAPIAuthentication auth = new WeatherAPIAuthentication();
    private WeatherAPIDataRetriever dataRetriever = new WeatherAPIDataRetriever();

    public WeatherData getWeatherDataForLocation(String location) {
        boolean authenticated = auth.authenticate();
        if (authenticated) {
            String authToken = auth.getAuthToken();
            WeatherData weatherData = dataRetriever.retrieveWeatherData(authToken, location);
            return weatherData;
        } else {
            return null;
        }
    }
}
