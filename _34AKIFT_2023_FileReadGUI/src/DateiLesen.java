import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DateiLesen {

    private String pfadUndName=new String();
    private String inhalt=new String();

    public DateiLesen() {
        //init
        pfadUndName=".\\src\\Main.java"; //default File
    }

    public DateiLesen(String pfadUndName) {
        this.pfadUndName = pfadUndName;
    }

    //Setter und Getter Methoden
    public void setPfadUndName(String pfadUndName) {
        //überprüfung auf Sinnhaftigkeit
        this.pfadUndName = pfadUndName;
    }

    public String getPfadUndName() {
        return pfadUndName;
    }

    public String getInhalt() {
        dateilesen();
        return inhalt;
    }

    private void dateilesen(){
        try {
            //alles lesen
             inhalt= Files.readString(Path.of(this.pfadUndName));

        } catch (IOException e) {
             System.out.println("ERROR: File read");
        }
    }
}
