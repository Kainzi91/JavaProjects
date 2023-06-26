
import java.util.Scanner;

/**
 EINGABE:
 (a) es müssen zwei beliebe Werte eingegeben werden können
 (b) ein Menü muss erscheinen

 Programm: Sin, Cos, Tan
 e ... Eingabe von Wert A und B
 h ... berechnen und anzeigen von A^B
 r ... berechnen und anzeigen von sin, cos und tan von A und B in Radiant
 d ... berechnen und anzeigen von sin, cos und tan von A und B in Grad
 ------------------------------------------------------------------------
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
 r ... berechnen und anzeigen von sin, cos und tan von A und B in Radiant
 d ... berechnen und anzeigen von sin, cos und tan von A und B in Grad
 ------------------------------------------------------------------------
 x ... beenden
 Auswahl:e

 Wert 1 eingeben: 3.0
 Wert 2 eingeben: 2.0

 Programm: Sin, Cos, Tan
 e ... Eingabe von Wert A und B
 h ... berechnen und anzeigen von A^B
 r ... berechnen und anzeigen von sin, cos und tan von A und B in Radiant
 d ... berechnen und anzeigen von sin, cos und tan von A und B in Grad
 ------------------------------------------------------------------------
 x ... beenden
 Auswahl:h

 Wert1^Wert2=9.00

 Programm: Sin, Cos, Tan
 e ... Eingabe von Wert A und B
 h ... berechnen und anzeigen von A^B
 r ... berechnen und anzeigen von sin, cos und tan von A und B in Radiant
 d ... berechnen und anzeigen von sin, cos und tan von A und B in Grad
 ------------------------------------------------------------------------
 x ... beenden
 Auswahl:x

 Beendet durch Benutzer
 */

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        Calc Calculation=new Calc();
      while (true) {
          System.out.println("\n e ... Eingabe von Wert A und B\n" +
                  " h ... berechnen und anzeigen von A^B\n" +
                  " r ... berechnen und anzeigen von sin, cos und tan von A und B in Radiant\n" +
                  " d ... berechnen und anzeigen von sin, cos und tan von A und B in Grad\n");
          System.out.print("Befehl eingeben: ");
          switch (input.next().toLowerCase()) {
              case "x":
                      System.exit(0);
              case "e":
                  System.out.print("Geben sie A ein :");
                  Calculation.setA(input.nextFloat());
                  System.out.print("Geben sie B ein :");
                  Calculation.setB(input.nextFloat());
                  break;
              case "h":
                    Calculation.printPow();
                  break;
              case "d":
                    Calculation.printDegree();
                  break;
              case "r":
                    Calculation.printRad();
                  break;
               default:
                  System.out.println("Kannst du nicht lesen?\n");
          }

      }

    }
}