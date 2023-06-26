import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Rechteck r1 = new Rechteck();

        while (true) {
            System.out.println("choose option(a,b,q):");
            String text = s1.next();
            if (text.equals("a")) {
                System.out.println("Eingabe der Seiten a,b\n");

                System.out.printf("Seite a: ");
                r1.setA(s1.nextDouble());

                System.out.printf("Seite b: ");
                r1.setB(s1.nextDouble());

            } else if (text.equals("b")) {
                System.out.println("Flächeninhalt = " + r1.getFläche() +
                        "\nUmfang = " + r1.getUmfang());


            } else if (text.equals("q")) {
                break;
            } else {
                System.out.println("ERROR Wrong Input");
            }
        }
    }
}








