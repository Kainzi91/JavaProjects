import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long lWert=0;
        double dZahl=0.0d;
        String text= new String();
/**
 *Scanner Eingabe
 */
        Scanner eingabe =new Scanner(System.in);

        do {


        System.out.println("Eingeben:");
         if (eingabe.hasNextLong())
         {
                lWert=eingabe.nextLong();
                text=eingabe.nextLine();
                System.out.println("Long="+lWert);
         } else if(eingabe.hasNextDouble())
        {
            dZahl=eingabe.nextDouble();
            text=eingabe.nextLine();
            System.out.println("Double= "+dZahl);
        }

        else
        {
            text=eingabe.nextLine();
            System.out.println("Text="+text);
        }
        }while(!text.equals("q"));
        /**
         * JOption
         */
        text= JOptionPane.showInputDialog("Eingabe");
        lWert=Long.parseLong(text);
        System.out.println("Long="+lWert);

    }
}