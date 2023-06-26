import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file =new File(".\\src\\main.java");
        try {
            String Zeile =new String();
            Scanner String= new Scanner(file);
            while(String.hasNextLine()){
                Zeile=String.nextLine();
                System.out.println(Zeile);

            }
            String.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }


    }
}
