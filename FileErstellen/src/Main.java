import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //File Liste
        File fileDir = new File(".\\");//aktuelles Directory //oder relativ eines zurück
        System.out.println("Verzeichnis von "+ fileDir.getAbsolutePath());
        //DateFormat sdf = new SimpleDateFormat("dd.mm.yyyy hh:mm a"); //a AM oder PM
        DateFormat sdf = new SimpleDateFormat("dd.mm.yyyy hh:mm"); //a AM oder PM
        //Variante A) abrufen der dir&file liste als String array
        String[] fileliste_string=fileDir.list();
        for(String name:fileliste_string) {
            //String in File/Dir umwandelen
            File eintrag = new File(fileDir.toString(), name);
            //timestamp der letzten Änderung
            System.out.print(sdf.format(eintrag.lastModified())+"\t");
            if(eintrag.isDirectory()){
                System.out.print("<DIR>\t");
            }else {
                System.out.print("     \t" + eintrag.getName()+"\t");
            }
            System.out.println(eintrag.getName());
        }

        //Variante B) abrufen der dir&file liste als List
        /*
        List fileliste;
        fileliste= Arrays.stream(fileDir.list()).toList();
        for(int d=0;d<fileliste.size();d++) {
            File eintrag = new File(fileDir.toString(), fileliste.get(d).toString());
            System.out.println(eintrag.getName());
        }
        */

    }
}