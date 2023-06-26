import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner eingabe=new Scanner(System.in);

        switch (eingabe.next())
        {
            case "x":
                eingabe.close();
                System.exit(-1);
                break;
            case "a":
                break;
            case "b":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;

        }

        NumberFormat newNumber = NumberFormat.getNumberInstance();
        newNumber.setMinimumIntegerDigits(2);
        newNumber.setMinimumIntegerDigits(2);

    }
}