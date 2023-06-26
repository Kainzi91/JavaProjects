import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


       String[] allFontNames= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        System.out.println(allFontNames.length);
        for (int i = 0; i < allFontNames.length; i++) {
            System.out.println("font = " + allFontNames[i]);
        }
        for (String font:allFontNames) {
            System.out.println("font = " + font);
        }

        ArrayList<String> listFontNames= new ArrayList<String>();
        for (String font:allFontNames
        ) {
            listFontNames.add(font);
        }

        System.out.println("listFontNames = " + listFontNames);
        for (String font:listFontNames
        ) {
            System.out.println("font = " + font);
        }

        //Arraylist in Array

        Object[] frontFromArrayList=listFontNames.toArray();

        for (int i = 0; i < frontFromArrayList.length; i++) {
            System.out.println("frontFromArrayList = " + frontFromArrayList[i]);
        }

        for (Object text:frontFromArrayList
             ) {
            System.out.println("text = " + text);

        }
    }
}