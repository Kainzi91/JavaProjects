import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        try {
            String all= Files.readString(Path.of(".\\src\\main.java"));

            System.out.println(all);
        } catch (IOException e) {
            System.out.println("Error reading File");
        }


    }
}