package org.example;

import java.io.Serializable;

public class OpenWeatherResponse implements Serializable {
    private String temperature;
    private String lat,lon,tempMin, tempMax;

    public String getTemperature() {
        return temperature;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public String getTempMin() {
        return tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    @Override
    public String toString() {
        return "OpenWeatherResponse{" +
                "temperature='" + temperature + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", tempMin='" + tempMin + '\'' +
                ", tempMax='" + tempMax + '\'' +
                '}';
    }
}
