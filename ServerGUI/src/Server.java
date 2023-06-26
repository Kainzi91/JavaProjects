import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

    private int port_nummer; //fixer Port

    private ServerSocket server;
    private String ip_adresse;
    private Socket verbindung;
    private String gelesen;



    // dafault Konstruktor mit automatischen port

    public Server() {
        this.port_nummer = 0;
        try {
            warteAufEineVerbindung();

        } catch (IOException e) {
            System.out.println("Error: TCP Verbindung");
        }

    }

    public Server(int port_nummer) {

        this.port_nummer = port_nummer;
        try {
            warteAufEineVerbindung();
        } catch (IOException e) {
            System.out.println("Error: TCP Verbindung");
        }


    }
    private void warteAufEineVerbindung() throws IOException {

        this.ip_adresse=InetAddress.getLocalHost().getHostAddress();

        System.out.println("Wartet auf Verbindung "+ InetAddress.getLocalHost().getHostAddress());

        // Server Socket erzeugen und mit port binden
        ServerSocket server = new ServerSocket(port_nummer);
        // abfragen der Portnummer des ServerSockets
        System.out.println("PORT: "+server.getLocalPort());

        // warten auf einen Client
         verbindung = server.accept(); // verbindung wird bei server accept aufgebaut
        //falls verbindung aufgebaut
        System.out.println("Verbindung hergestellt: "+verbindung.getInetAddress());



    }

    public int getPort_nummer() {

        return port_nummer;

    }

    public String getIp_adresse() {

        return ip_adresse;

    }

    private String read() throws IOException {
        BufferedReader read=new BufferedReader(new InputStreamReader(verbindung.getInputStream()));
       String gelesen = read.readLine();
       return gelesen;
    }
    private String send() throws IOException {
        BufferedWriter sende = new BufferedWriter(new OutputStreamWriter(verbindung.getOutputStream()));
        sende.write("ECHO: " + gelesen.toUpperCase() + "\n"); // schicken einer Zeile

        return sende.toString();
    }

    public String getGelesen() throws IOException {
        this.gelesen=read();
        return this.gelesen;
    }

    public void setGelesen() throws IOException {
        this.gelesen=send();

    }
}
