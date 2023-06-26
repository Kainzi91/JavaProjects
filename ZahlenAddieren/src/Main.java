import java.text.NumberFormat;
import java.util.Scanner;

/**
 EINGABE:
 (a) es müssen zwei beliebe Werte eingegeben werden können
 (b) ein Menü muss erscheinen

     Programm: ArcSin, ArcCos, ArcTan
     e ... Eingabe von Wert A und B
     h ... berechnen und anzeigen von A^B
     r ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Radiant
     d ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Grad
     ---------------------------------------------------------------------------------
     x ... beenden
     Auswahl:

 (c) dss Prgramm (Menüanzeige) wird solange wiederholt bis 'x' eingegeben wird

BERECHNUNG:
 (a)	die notwendigen Berechnungen erfolgen in einer eigenen Klasse mit
        entsprechenden Methoden
 (b)	Die Klasse muss einen default Konstruktor unterstützen
 (c)	Die Klasse muss einen Konstruktor unterstützen den man genau
        einen Wert übergeben kann und zusätzlich muss eine set Methode zur
        Übergabe des Werts implementiert werden
 (d)	Die Klasse bietet eine Methoden zur Berechnung des sin, cos und tan
        aus dem übergebenen Wert an (siehe Methode Math.)
 (e)	Die Klasse bietet eine Methode zu Berechnung des sin, cos und tan aus dem
        übergebenen Wert in Grad an.
 Info: siehe dazu die Klasse Math. an, das Ergebnis einer Tangensberechnung kann man
        mittels einer Methode von Math. in Grad (englisch toDegree() ) umwandeln.
        Ist der an in Grad negativ muss 360 addiert werden.
 (f)	Die Klasse biete eine Methode zur Potenzrechnung mit einer anderen Zahl an
        (Math.pow())
 (g)	Mittels getMethoden kann man die Ergebniss aus der Klasse abrufen.
 (h)	Die Darstellung
    (a)	der Potenzrechung A^B hat 2 Kommastellen.
    (b)	sin, cos und tan in Radiant hat 3 Kommastellen
    (c)	sin, cos und tan in Grad hat 1 Kommastelle

 CODE DOKUMENTATION:
 (a) verwendet werden muss JavaDoc


  z.B:
 Programm: Sin, Cos, Tan
 e ... Eingabe von Wert A und B
 h ... berechnen und anzeigen von A^B
 r ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Radiant
 d ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Grad
 ---------------------------------------------------------------------------------
 x ... beenden
 Auswahl:e

 Wert 1 eingeben: 3.0
 Wert 2 eingeben: 2.0

 Programm: Sin, Cos, Tan
 e ... Eingabe von Wert A und B
 h ... berechnen und anzeigen von A^B
 r ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Radiant
 d ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Grad
 ------------------------------------------------------------------------
 x ... beenden
 Auswahl:h

 Wert1^Wert2=9.00

 Programm: arcsin, arccos und arctan
 e ... Eingabe von Wert A und B
 h ... berechnen und anzeigen von A^B
 r ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Radiant
 d ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Grad
 ------------------------------------------------------------------------
 x ... beenden
 Auswahl:x

 Beendet durch Benutzer
 */

public class Main {
    public static void main(String[] args) {
        Rechner wertA=new Rechner();
        Rechner wertB=new Rechner();
        //Scanner Objekt zum EInlesen von der Konsole anlegen
        Scanner eingabe=new Scanner(System.in);
        String auswahl=new String();
        do {
            anzeigen_menue();
            auswahl = eingabe.nextLine();
            switch (auswahl) {
                case "e":
                    wertA=wert_eingabe("Wert A=");
                    wertB=wert_eingabe("Wert B=");
                    break;
                case "h":
                    anzeigen_ergebnis_hoch(wertA,wertB);
                    break;
                case "r":
                    anzeigen_ergebnis_rad(wertA,wertB);
                    break;
                case "d":
                    anzeigen_ergebnis_deg(wertA,wertB);
                    break;
            }
        }while(!auswahl.equalsIgnoreCase("X"));//bis X getippt wurde
        System.out.println("Prorgamm ");
    }

    private static void anzeigen_menue(){
        System.out.println("Programm: arcsin, arccos und arctan");
        System.out.println("e ... Eingabe von Wert A und B");
        System.out.println("h ... berechnen und anzeigen von A^B");
        System.out.println("r ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Radiant");
        System.out.println("d ... berechnen und anzeigen von arcsin, arccos und arctan von A und B in Grad");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("x ... beenden");
        System.out.print("Auswahl:");
    }
    private static void anzeigen_ergebnis_hoch(Rechner A, Rechner B){
        //Kommastellen Anzeige
        NumberFormat nf_komma = NumberFormat.getInstance();
        nf_komma.setMaximumFractionDigits(2);
        nf_komma.setMinimumFractionDigits(2);//--> immer 2 Stelle
        //Berechnung
        Rechner a_hoch_b;
        a_hoch_b=A.getHoch(B);
        System.out.println(A.getWert() + "^" + B.getWert()+"="+ nf_komma.format(a_hoch_b.getWert()));
    }

    private static void  anzeigen_ergebnis_rad(Rechner A, Rechner B){
        //Kommastellen Anzeige
        NumberFormat nf_komma_rad = NumberFormat.getInstance();
        nf_komma_rad.setMaximumFractionDigits(3);
        nf_komma_rad.setMinimumFractionDigits(3);//--> immer 3 Stelle
        //Berechnung
        System.out.println("rad   arcsin acrcos arctan");
        System.out.println("--------------------------");
        System.out.println("   A|"+
                " " + nf_komma_rad.format(A.getArcsinR())+
                "  " + nf_komma_rad.format(A.getArccosR())+
                "  " + nf_komma_rad.format(A.getArctanR()));
        System.out.println("   B|"+
                " " + nf_komma_rad.format(B.getArcsinR())+
                "  " + nf_komma_rad.format(B.getArccosR())+
                "  " + nf_komma_rad.format(B.getArctanR()));
    }
    private static void  anzeigen_ergebnis_deg(Rechner A, Rechner B){
        //Kommastellen Anzeige
        NumberFormat nf_komma_deg = NumberFormat.getInstance();
        nf_komma_deg.setMaximumFractionDigits(1);
        nf_komma_deg.setMinimumFractionDigits(1);//--> immer 1 Stelle
        //Berechnung
        //Berechnung
        System.out.println("deg   arcsin acrcos arctan");
        System.out.println("--------------------------");
        System.out.println("   A|"+
                " " + nf_komma_deg.format(A.getArcsinG())+
                "° " + nf_komma_deg.format(A.getArccosG())+
                "° " + nf_komma_deg.format(A.getArctanG())+
                "° " );
        System.out.println("   B|"+
                " " + nf_komma_deg.format(B.getArcsinG())+
                "° " + nf_komma_deg.format(B.getArccosG())+
                "° " + nf_komma_deg.format(B.getArctanG())+
                "° " );
    }

    private static  Rechner wert_eingabe(String anzeige){
        //Scanner Objekt zum Einlesen von der Konsole anlegen
        Scanner eingabe=new Scanner(System.in);
        Rechner wert=new Rechner();
        //flag zur Eingabeüberwachung
        boolean eingabe_korrekt=false;
        do {
            System.out.print(anzeige);
            if (eingabe.hasNextDouble()) {
                wert.setWert(eingabe.nextDouble());
                eingabe_korrekt = true;
            }
            eingabe.nextLine();//<RETRUN> auslesen
        }while(!eingabe_korrekt);
        //Rückgabe
        return wert;
    }
}