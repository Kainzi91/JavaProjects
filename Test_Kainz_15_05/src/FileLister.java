import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FileLister {

    private File fileDir;


    private String[] output;
    private String path ;
    private String absolutePath ;
    private ArrayList<String> outputList=new ArrayList<String>();

    public FileLister(String directoryPath) {
        this.fileDir = new File(directoryPath);
        this.path =directoryPath;
        this.absolutePath=fileDir.getAbsolutePath();
        listFiles();
    }

    private void listFiles() {
       // System.out.println(fileDir.getAbsolutePath());

        String[] fileliste_string = fileDir.list();
        for(String name : fileliste_string) {
            File eintrag = new File(fileDir.toString(), name);
           // System.out.print(sdf.format(eintrag.lastModified())+"\t");
            outputList.add(eintrag.getName());
            System.out.println(eintrag.getName());
        }
        output=outputList.toArray(new String[0]);
    }

    public void setFileDir(File fileDir) {
        this.fileDir = fileDir;
    }

    public File getFileDir() {
        return fileDir;
    }

    public String[] getOutput() {
        return output;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {

        this.path = path;
        this.fileDir = new File(path);
        this.absolutePath=fileDir.getAbsolutePath();
        outputList.clear();
        listFiles();

    }

    public String getAbsolutePath() {
        return absolutePath;
    }
}
