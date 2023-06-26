
import org.json.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Weather {

    private String url;
    private String allValues;
    private String queryOrt;
    private String temperatur;
    private String luftfeuchte;
    private String luftdruck;
    public Weather() throws JSONException {
    }

    private void sendqueryOrt() throws IOException, JSONException {

        url = "http://api.openweathermap.org/data/2.5/weather?q=" + queryOrt + "&units=metric&appid=feafbc02a888d27599aa924ae7a72073";
        URL obj = new URL(url);

        HttpURLConnection wetterservice = (HttpURLConnection) obj.openConnection();
        //antwort lesen
        BufferedReader in = new BufferedReader(new InputStreamReader(wetterservice.getInputStream()));;
        String inputLine;

        StringBuffer response = new StringBuffer();
        //einlesen bis zumEnde
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);

        }
        in.close();

        //in string umwandeln
        this.allValues = response.toString();

            sendParameter();
    }


    private void sendParameter () throws JSONException, IOException {

        String jsonString = this.allValues ;
        JSONObject jsobj = new JSONObject(jsonString);

        JSONObject obj = new JSONObject(jsonString);

        this.temperatur= obj.getJSONObject("main").getString("temp")+" °C";
        this.luftdruck = obj.getJSONObject("main").getString("pressure")+" mmHg";
        this.luftfeuchte = obj.getJSONObject("main").getString("humidity")+" %";

    }
    public String getTemperatur() {
        return temperatur;
    }

    public String getLuftfeuchte() {
        return luftfeuchte;
    }

    public String getLuftdruck() {
        return luftdruck;
    }

    public void setQueryOrt(String queryOrt) throws JSONException, IOException {
        this.queryOrt = queryOrt;
        sendqueryOrt();
    }

}