import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Collections;

/**
 * Autor Kainz Alexander
 *
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> MeineLottoZahlen= new ArrayList<Integer>();

        Scanner eingabe=new Scanner(System.in);
        Zufall RandomZahl=new Zufall(1,45);
        System.out.println();

        while(true){
            menue();

            LocalDate today= LocalDate.now();
        switch (eingabe.next())
        {

            case "q":
                eingabe.close();
                Collections.sort(MeineLottoZahlen);
                System.out.println("Mein Tipp vom "+today);
                System.out.println("----------------------------");
                for (int i = 0; i < MeineLottoZahlen.size(); i++) {
                    System.out.print(MeineLottoZahlen.get(i)+",");
                }
                System.out.println("\n");
                System.out.print("Lotto Ziehung: ");

                Ziehung NewZiehung= new Ziehung();
                NewZiehung.getNumbers();
                for (int i = 0; i < NewZiehung.getNumbers().size(); i++) {
                    System.out.print(NewZiehung.getNumbers().get(i)+",");
                }
                int treffer=0;
                System.out.println("\n");
                if (MeineLottoZahlen.size() == 6) {
                    treffer= NewZiehung.compare(MeineLottoZahlen);
                }
                System.out.println("\nSie hatten "+treffer+ " Treffer");
                eingabe.close();
                System.exit(130);


            case "t":
                MeineLottoZahlen.clear();
                    for(int i=1 ; i<=6; i++ ){

                        MeineLottoZahlen.add(wert_eingabe(i));
                    }


             break;
             default:
                System.out.println("ERROR: falsche Eingabe");
        }
        }


    }
    private static void menue(){
        System.out.println("\nt........Lottotipp eingeben");
        System.out.println("q........beenden und auswerten");
    }

    private static int wert_eingabe(int Nummer){
        //Scanner Objekt zum EInlesen von der Konsole anlegen
        Scanner eingabe=new Scanner(System.in);
        int wert=0;
        //flag zur Eingabeüberwachung
        boolean eingabe_korrekt=false;
        do {
            System.out.print((Nummer)+".Zahl eingeben:");
            if (eingabe.hasNextInt()) {
                wert=eingabe.nextInt();
                if (wert<1 || wert>45 ) {

                    eingabe.nextLine();
                    continue;
                }
                else
                    eingabe_korrekt = true;
            }
            else {
                eingabe.nextLine();//<RETRUN> auslesen

            }
        }while(!eingabe_korrekt);
        //Rückgabe
        return wert;
}
}