import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException
    {

            String rechnerName = new String();
            rechnerName = InetAddress.getLocalHost().getHostName();
            InetAddress[] alleAdressen;
            alleAdressen = InetAddress.getAllByName(rechnerName);

            for (int i = 0; i < alleAdressen.length / 2; i++) {
                NetworkInterface ni = NetworkInterface.getByInetAddress(alleAdressen[i]);
                byte []Mac =ni.getHardwareAddress();
                System.out.println("Netzwerkkarte: . . . . . . . . . : " + ni.getDisplayName());
                System.out.println("Physikalische Adresse:  . . .  . : " + bytesToHexWithSeparator(Mac));
                System.out.println("Verbindungslokale IPv6-Adresse . : " + alleAdressen[i + alleAdressen.length / 2].getHostAddress());
                System.out.println("IPv4-Adresse  . . . . . . . .  . : " + alleAdressen[i].getHostAddress());
                System.out.println("");

                }


        }
    public static String bytesToHexWithSeparator(byte[] bytes) {
        final char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[bytes.length * 3 - 1];
        for (int j = 0, k = 0; j < bytes.length; j++, k += 3) {
            int v = bytes[j] & 0xFF;
            hexChars[k] = hexArray[v >>> 4];
            hexChars[k + 1] = hexArray[v & 0x0F];
            if (j < bytes.length - 1) {
                hexChars[k + 2] = '-';
            }
        }
        return new String(hexChars);
    }

}
