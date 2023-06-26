import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck();
        Dreieck d1 = new Dreieck();
       //Kreis k1 = new Kreis();


        Scanner eingabe = new Scanner(System.in);
        while(true) {
            Menu();

            System.out.print("Geben sie einen Befehl ein: ");
            switch (eingabe.next()) {

                    case "x":
                    eingabe.close();
                    System.exit(130);
                    case "r":

                    System.out.print("Geben sie a ein: ");
                    r1.setA(eingabe.nextDouble());
                    System.out.print("Geben sie b ein: ");
                    r1.setB(eingabe.nextDouble());
                    System.out.println("\nUmfang: " + r1.getUmfang() + "\nFlaeche: " + r1.getFlaeche());

                    break;

                    case "d":
                    System.out.print("Geben sie a ein: ");
                    d1.setA(eingabe.nextDouble());

                    System.out.print("Geben sie b ein: ");
                    d1.setB(eingabe.nextDouble());
                    System.out.print("Geben sie c ein: ");
                    d1.setC(eingabe.nextDouble());

                    System.out.println("\nUmfang: " + d1.getUmfang() + "\nFlaeche: " + d1.getFlaeche());
                    break;

                    case "k":
                    System.out.print("Geben sie r ein: ");
                    Kreis k1 = new Kreis(eingabe.nextDouble());

                    System.out.println("\nUmfang: " + k1.getUmfang() + "\nFlaeche: " + k1.getFlaeche());
                    System.out.println("\nUmfang: " + k1.getUmfang() + "\nFlaeche: " + k1.getFlaeche());
                    break;

                    default:
                    System.out.println("Your are an Idiot!!");
            }
        }
    }
    public static void Menu(){
        System.out.println("\nr......Rechteck");
        System.out.println("d......Dreieck");
        System.out.println("k......Kreis");
        System.out.println("x......Beenden\n");

    }

}