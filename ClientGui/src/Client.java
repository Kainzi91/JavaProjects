import java.io.*;
import java.net.Socket;

public class Client {

    Socket verbindung = new Socket();
    String ip_address =new String();
    private String protokoll;
    int port_nummer ;


    public Client(String ip_address, int port_nummer) {
        this.ip_address = ip_address;
        this.port_nummer = port_nummer;
        connect();

    }
    private void connect(){
        try {
            Socket verbindung = new Socket(ip_address,port_nummer);
            //senden von Text


        } catch (IOException e) {
            System.out.println("ERROR: Socket aufbau");
        }


    }
    private String read() throws IOException {
        BufferedReader read=new BufferedReader(new InputStreamReader(verbindung.getInputStream()));
        String gelesen = read.readLine();
        return gelesen;
    }
    private String send() throws IOException {
        BufferedWriter sende = new BufferedWriter(new OutputStreamWriter(verbindung.getOutputStream()));
        sende.write("ECHO: " + protokoll.toUpperCase() + "\n"); // schicken einer Zeile
        sende.flush();
        return sende.toString();
    }

    public String getProtokoll() throws IOException {
         this.protokoll=send();

        return protokoll;
    }

    public void setProtokoll(String protokoll) {
        this.protokoll = protokoll;
    }
}
