import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DateiLesen {

    private String pfadundname ;
    private String inhalt;

    public DateiLesen() {
        this.pfadundname = ".\\src\\main.java";
    }

    public DateiLesen(String pfadundname) {
        this.pfadundname = pfadundname;
    }



    public String getInhalt() {
        dateilesen();
        return inhalt;
    }

    public String getPfadundname() {
        return pfadundname;
    }

    public void setPfadundname(String pfadundname) {
        this.pfadundname = pfadundname;
    }

    private void dateilesen(){

        try {
           inhalt= Files.readString(Path.of(this.pfadundname));

            System.out.println(this.inhalt);
        } catch (
                IOException e) {
            System.out.println("Error reading File");
        }

    }

}
