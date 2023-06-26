/**
 * Klasse zum Berechnen und Ausgeben von Sin,Cos,Tan  mit 2 Werten
 */

public class Calc {

    private double a=0.0;
    private double b=0.0;


    public Calc() {
    }
    /**
     * A hoch B ausgeben
     */
    public void printPow(){
        System.out.println(getA()+"^"+getB()+"="+Math.pow(getA(),getB()));
    }
    /**
     * Ausgabe A und B in Radianten
     */
    public void printRad()
    {
        System.out.println("A:"+getA());

        System.out.println("asin="+Math.asin(getA()));
        System.out.println("acos="+Math.acos(getA()));
        System.out.println("atan="+Math.atan(getA()));

        System.out.println("B:"+getB());

        System.out.println("asin="+Math.asin(getB()));
        System.out.println("acos="+Math.acos(getB()));
        System.out.println("atan="+Math.atan(getB()));
    }

    /**
     * Ausgabe A und B in Grad
     */

    public void printDegree(){
        System.out.println("A:"+getA());

        System.out.println("asin="+Math.toDegrees(Math.asin(getA())));
        System.out.println("acos="+Math.toDegrees(Math.acos(getA())));
        System.out.println("atan="+Math.toDegrees(Math.atan(getA())));



        System.out.println("B:"+getB());

        System.out.println("asin="+Math.toDegrees(Math.asin(getB())));
        System.out.println("acos="+Math.toDegrees(Math.acos(getB())));
        System.out.println("atan="+Math.toDegrees(Math.atan(getB())));


    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calc{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
