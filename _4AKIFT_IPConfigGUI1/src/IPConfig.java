import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class IPConfig {
    private String rechnername=new String();
    //private ArrayList adapterName=new ArrayList();//Arraylist erlaubt das Hinzufügen
                                                    //aller Objekte
    private ArrayList<String> adapterName=new ArrayList<String>(); //beschränken auf Sting()
    private ArrayList<String> ipv6=new ArrayList<String>();
    private ArrayList<String> ipv4=new ArrayList<String>();
    private ArrayList<String> subnetmask=new ArrayList<String>();

    public IPConfig()  {
        try {
            //Rechnername abfragen
            rechnername = InetAddress.getLocalHost().getHostName();
            //Alle IPAdressen abfragen
            InetAddress[] alle_adressen;
            alle_adressen=InetAddress.getAllByName(rechnername);
            for(int i=0;i<(int)alle_adressen.length/2;i++) {
                //adapter auslesen
                NetworkInterface net = NetworkInterface.getByInetAddress(alle_adressen[i]);
                //arraylist befüllen
                adapterName.add(net.getDisplayName());
                ipv6.add(alle_adressen[i+(int)alle_adressen.length/2].getHostAddress());
                ipv4.add(alle_adressen[i].getHostAddress());
                subnetmask.add(calcSubnetmask(net.getInterfaceAddresses().get(0).getNetworkPrefixLength()));

            }
    }catch(UnknownHostException e){
            System.out.println("ERROR: Hostname nicht bekannt!");
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
    //Rückgabe aller Adapternamen
    public ArrayList<String> getAdapterName() {
        return adapterName;
    }

    public ArrayList<String> getIpv6() {
        return ipv6;
    }

    public ArrayList<String> getIpv4() {
        return ipv4;
    }

    public ArrayList<String> getSubnetmask() {
        return subnetmask;
    }

    private String calcSubnetmask(short prflen){
        //* short prflen=...getNetworkPrefixLength();
        int shft = 0xffffffff<<(32-prflen);
        int oct1 = ((byte) ((shft&0xff000000)>>24)) & 0xff;
        int oct2 = ((byte) ((shft&0x00ff0000)>>16)) & 0xff;
        int oct3 = ((byte) ((shft&0x0000ff00)>>8)) & 0xff;
        int oct4 = ((byte) (shft&0x000000ff)) & 0xff;
        return  oct1+"."+oct2+"."+oct3+"."+oct4;
    }

}
