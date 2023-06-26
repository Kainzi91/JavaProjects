import java.lang.reflect.Array;

/**
 * String
 */

public class Main {
    public static void main(String[] args) {

        String text1 = new String("Hallo du hallo");
        String text2 = new String("Hallo");
        String text3 = text1; // Erzeugt Text 3 und welches auf den gleiche Speicheradresse hat als Text1
        String text4 = new String("hallo");
        String textArray[]= text1.split(" ");
        // String[] textArray
        // String textArray[]
        for (String text:textArray) {
            System.out.println(text);
        }

        for (int i =0; i<textArray.length;i++) {
            System.out.println(textArray[i].toUpperCase());
        }
        /**
         * text1 ==text2 vergleich nicht die Inhalte sonst die Speicheradressen
         */





        /**
         * Speicheradressen vergleichen
         */
        if (text1 == (text2)) {
            System.out.println("text 1 = text 2");
        } else
            System.out.println("text1 != text2");
        if (text1 == text3) {
            System.out.println("text 1 = text 3");
        } else System.out.println("text1 != text3");
        /**
         * Textinhalte verleichen
         */
        if (text1.equals(text2)) {
            System.out.println("text 1 equals text 3");
        } else
            System.out.println("text1 do not equal text3");

        if (text1.equals(text3)) {
            System.out.println("text 1 equals text 3");
        } else System.out.println("text1 do not equal text3");

        if (text1.equals(text4)) {
            System.out.println("text 1 equals text 4 (CASESENSITIVE)");
        } else System.out.println("text1 do not equal text4 (CASESENSITIVE)");

        if (text1.equalsIgnoreCase(text4)) {
            System.out.println("text 1 equals text 4");
        } else System.out.println("text1 do not equal text4");


        //Zusamenfügen von Texten
        String textJava = new String("Java");
        String textHello = new String("Hello ");
        // um diesen text in einem String zu speichern
        System.out.println("Hello Java");
        String textHelloJava=new String();
        textHelloJava=textHello+textJava;
        System.out.println(textHelloJava);
        //umwandeln auf to UpperCase
        System.out.println(textHelloJava.toUpperCase());
    }
}

