package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

    static String get(String urlString) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                String retVal;
                while ((retVal = bufferedReader.readLine()) != null) {
                    sb.append(retVal);
                }
            }
        } catch (IOException e) {
            System.out.println("Error fetching URL");
        }
        return sb.toString();
    }
}
