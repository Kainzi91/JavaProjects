package org.example;

import java.util.Arrays;

public class OpenweatherParser {
private static String[] querykeys = {"temp_min", "temp_max", "temperature", "lat", "lon"};
    static OpenWeatherResponse parseHttpBody(String body) {
        OpenWeatherResponse response = new OpenWeatherResponse();
        Arrays.stream(querykeys).forEach(s -> {
            int index = body.indexOf(s);
            System.out.println(body.substring(index));
        });
        String[] keys = body.split(":");
        Arrays.stream(keys).forEach(s -> System.out.println(s));
        return response;
    }
}
