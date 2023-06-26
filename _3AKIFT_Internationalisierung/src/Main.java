import java.text.DecimalFormat;
import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Locale mit default "+Locale.getDefault());
        System.out.println("Locale mit default "+Locale.GERMANY);
        System.out.println("Locale mit default "+Locale.US);
        Locale locale=Locale.getDefault();
        System.out.println("Sprache     : "+locale.getLanguage());
        System.out.println("Sprache ISO : "+locale.getISO3Language());
        System.out.println("Land        : "+locale.getCountry());
        System.out.println("Land ISO    : "+locale.getISO3Country());
        System.out.println("Name        : "+locale.getDisplayCountry());
        System.out.println("DisplayName : "+locale.getDisplayName());



        /**
         * ZahlenFormate
         */
        double value=123456789.890123;
        printNumber(value, "00.0");
        printNumber(value, "0000000000.0");
        printNumber(value, "#.000");
        printNumber(value, "#,###.000");
        printNumber(value, "0.000E00");
    }
    public static void printNumber(double Wert, String Formatierung)
    {

        DecimalFormat df=new DecimalFormat(Formatierung);
        System.out.println(df.format(Wert));

    }
}