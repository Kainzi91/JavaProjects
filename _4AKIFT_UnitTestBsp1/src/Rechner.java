import org.junit.jupiter.api.Test;

public class Rechner {
    private double a;
    private double b;
    private int fakultaet;
    private int[] ergebnisse={0,1,2,3,4,5};

    public Rechner() {
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

    public double getSumme(double a, double b)
    {
        return a+b;
    }

    public int getFakultaet(int value) {
        if(value<0) throw new IllegalArgumentException();

        fakultaet=1;
        for(int i=2;i<=value;i++) fakultaet*=i;

        return fakultaet;
    }

    public int[] getErgebnisse() {
        return ergebnisse;
    }
}
