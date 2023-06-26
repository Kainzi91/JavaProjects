import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file =new File(".\\src\\Main.java");

        int iZeichen;
        StringBuffer fileBuffer=new StringBuffer();
        try (FileReader filereader = new FileReader(file)) {
            while ((iZeichen =filereader.read()) != -1)
            {
                fileBuffer.append((char)iZeichen);
            }
            System.out.println(fileBuffer);
        } catch (IOException e) {
            System.out.println("Error file lesen");
        }

    }
}