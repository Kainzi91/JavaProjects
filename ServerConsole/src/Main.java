import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        int port_nummer_fix= 12349; //fixer Port
        int port_nummer_automatisch= 0; //es wird ein freies Port gesucht

        try {
            System.out.println("Wartet auf Verbindung "+ InetAddress.getLocalHost().getHostAddress());

            // Server Socket erzeugen und mit port binden
            ServerSocket server = new ServerSocket(port_nummer_fix);
            // abfragen der Portnummer des ServerSockets
            System.out.println("PORT: "+server.getLocalPort());

            // warten auf einen Client
            Socket verbindung = server.accept(); // verbindung wird bei server accept aufgebaut
            //falls verbindung aufgebaut
            System.out.println("Verbindung hergestellt: "+verbindung.getInetAddress());

            BufferedReader read=new BufferedReader(new InputStreamReader(verbindung.getInputStream()));
            String gelesen = read.readLine();
            System.out.println(gelesen);

            // echo zurück
            BufferedWriter sende=new BufferedWriter(new OutputStreamWriter(verbindung.getOutputStream()));
            sende.write("ECHO: "+gelesen.toUpperCase()+"\n"); // schicken einer Zeile
            sende.flush();



        } catch (UnknownHostException e) {
            System.out.println("Error: IPADDRESS");
        } catch (IOException e) {
            System.out.println("Error: SERVER SOCKET");
        }
    }
}