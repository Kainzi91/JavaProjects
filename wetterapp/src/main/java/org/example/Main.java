package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ort eingeben:");
        String location = scanner.nextLine();
        OpenweatherApi api = new OpenweatherApi();
        System.out.println(api.getWeatherForLocation(location));
    }
}