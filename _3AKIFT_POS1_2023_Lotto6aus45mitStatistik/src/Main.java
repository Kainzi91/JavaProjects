import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] atrgs) {
        //speichern von der Eingabe lotto tip
        int[] mein_tipp={0,0,0,0,0,0};

        //einlesen von der Konsole
        Scanner scanner = new Scanner(System.in);
        //System.out.println("******* START AUFAGBE 1 *******");
        //Einlesen von der Konsole Augabe 1
        while (true)
        {
            System.out.println("t ... Lottotipp eingeben");
            System.out.println("q ... beenden und auswerten (Aufgabe 2)");

            String s = scanner.next();
            scanner.nextLine();
            //System.out.println("String: " + s);
            if(s.equalsIgnoreCase("t")){
                for(int t=0;t<6;t++) {
                    //eingeben der Lotto Zahlen
                    boolean nicht_korrekt=true;
                    while(nicht_korrekt) {
                        System.out.print((t + 1) + ". Lottozahl eingeben:");
                        if(scanner.hasNextInt()) {
                            mein_tipp[t] = scanner.nextInt();
                            if(mein_tipp[t]>0 && mein_tipp[t]<46) nicht_korrekt=false;//ohne Check auf gleiche Zahlen
                        }
                        scanner.nextLine();
                    }
                }
            }
            else if(s.equalsIgnoreCase("q")) break; //verlässt das while()
                //alle anderen Strings
            else System.out.println("ERROR: falsche Eingabe");
        }
        //schliessen des scanners
        scanner.close();
        //Sortieren des Tipps
        Arrays.sort(mein_tipp);
        //Ausgabe des Tipps

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm.ss");

        System.out.println("Mein Tipp vom: "+ dtf.format(LocalDateTime.now()));
        System.out.println("----------------------------------");
        for(int t=0;t<6;t++) System.out.print(mein_tipp[t]+",");
        System.out.println();//Zeilenumbruch
        //System.out.println("******* ENDE AUFAGBE 1 *******\n");

        //System.out.println("******* START AUFAGBE 2 *******");
        //Auswertung Aufgabe 2
        Lotto6aus45 lotto=new Lotto6aus45();

        int[] kugeln = lotto.getZiehung();
        System.out.print("\nLotto Ziehung ");
        for (int kugel : kugeln) System.out.print(kugel + ",");

        //System.out.println("\n******* ENDE AUFAGBE 2 *******\n");

       //System.out.println("******* START BONUS *******");
        //System.out.println("\n\nAuswertung der Ziehung: Du hast einen "+lotto.getAuswertung(mein_tipp)+"-er");
        //System.out.println("******* ENDE BONUS *******");
        Statistik statistik=new Statistik();
        //10.000 Ziehungen
        for (int i = 0; i < 100000 ; i++) {
           kugeln= lotto.getZiehung();
            statistik.setAnzahlDerRichtigen(lotto.getAuswertung(mein_tipp));
        }
        System.out.println(statistik.toString());
    int anzahlDerSechser=0;
        do {
        kugeln= lotto.getZiehung();
        statistik.setAnzahlDerRichtigen(lotto.getAuswertung(mein_tipp));
        anzahlDerSechser= statistik.getHaeufigkeit_abs()[6];
    }while(anzahlDerSechser>0);

    }

}