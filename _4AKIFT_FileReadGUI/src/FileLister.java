import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FileLister {

    private File fileDir;
    private DateFormat sdf;

    public FileLister(String directoryPath) {
        this.fileDir = new File(directoryPath);
        this.sdf = new SimpleDateFormat("dd.mm.yyyy hh:mm");
    }

    public void listFiles() {
        System.out.println("Verzeichnis von "+ fileDir.getAbsolutePath());

        String[] fileliste_string = fileDir.list();
        for(String name : fileliste_string) {
            File eintrag = new File(fileDir.toString(), name);
            System.out.print(sdf.format(eintrag.lastModified())+"\t");
            if(eintrag.isDirectory()){
                System.out.print("<DIR>\t");
            }else {
                System.out.print("     \t" + eintrag.getName()+"\t");
            }
            System.out.println(eintrag.getName());
        }
    }

    public void setFileDir(File fileDir) {
        this.fileDir = fileDir;
    }

    public File getFileDir() {
        return fileDir;
    }
}
