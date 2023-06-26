package org.example;

public class OpenweatherApi {
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s";
    private final static String API_KEY = "babad62e717fb47cd462bed9ce3d0117";

    public OpenWeatherResponse getWeatherForLocation(String location) {
        if(location == null) {
            throw new IllegalArgumentException("location must not be empty!");
        }
        String responseString = HttpClient.get(String.format(BASE_URL, location, API_KEY));

       return OpenweatherParser.parseHttpBody(responseString);
    }


}
