import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        String ip_adresse = "172.16.85.62";
        int port_nummer = 12349;

        try {
            Socket verbindung = new Socket(ip_adresse,port_nummer);
            //senden von Text
            BufferedWriter sende=new BufferedWriter(new OutputStreamWriter(verbindung.getOutputStream()));
            sende.write("hallo\n"); // schicken einer Zeile
            sende.flush();

            // Ende des Sendens
            BufferedReader read=new BufferedReader(new InputStreamReader(verbindung.getInputStream()));
            String gelesen = read.readLine();
            System.out.println(gelesen);


        } catch (IOException e) {
            System.out.println("ERROR: Socket aufbau");
        }

    }
}