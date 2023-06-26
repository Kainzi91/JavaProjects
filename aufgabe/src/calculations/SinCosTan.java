package calculations;

public class SinCosTan {

    public static double tan (double a, double  b) {

     return Math.tan(b/a);
    }

    public static double sin (int a, int b) {
        double hypothenusis = hypothenusis(a,b);
        return Math.sin(b/hypothenusis);
    }

    public static double cos (int a, int b) {
        double hypothenusis = hypothenusis(a,b);
        return Math.sin(a/hypothenusis);
    }

    private static double hypothenusis(double a, double b ) {
        double adjacent=a, opposite=b, hypotenuse;
        hypotenuse= Math.sqrt((adjacent*adjacent)+(opposite*opposite));
        return hypotenuse;
    }
}
