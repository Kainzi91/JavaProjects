import java.io.*;

public class Main {
    public static void main(String[] args){

        File file =new File(".\\src\\main.java");
        try  {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String zeile =new String();
            StringBuffer Stringfile=new StringBuffer();
            while ((zeile= buffer.readLine())!= null)
            {
                Stringfile.append(zeile+"\n");
            }
            System.out.println(Stringfile);
        } catch (IOException e) {
            System.out.println("Error File lesen");
        }

    }
}