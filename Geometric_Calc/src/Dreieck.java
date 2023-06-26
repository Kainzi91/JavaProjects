import java.text.NumberFormat;

public class Dreieck {
    protected double a;
    protected double b;
    private double c;
    protected double umfang;
    protected double flaeche;

    public Dreieck()
    {
    }
    public Dreieck(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c = c;
    }

    /**
     * Heron-Formel
     */
    protected void flaecheBerechnen()
    {
        double s=(this.a+this.b+this.c)/2;
        this.flaeche= Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    }
    protected void umfangBerechnen() {this.umfang= this.a+this.b+this.c;}

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

    public void setC(double c)
    {
        this.c = c;
    }
    public String getUmfang() {
        NumberFormat s_umfang =NumberFormat.getInstance();
        s_umfang.setMaximumFractionDigits(2);
        s_umfang.setMinimumFractionDigits(2);

        umfangBerechnen();
        return s_umfang.format(umfang);
    }

    public String getFlaeche() {
        NumberFormat s_flaeche =NumberFormat.getInstance();
        s_flaeche.setMaximumFractionDigits(2);
        s_flaeche.setMinimumFractionDigits(2);
        flaecheBerechnen();
        return s_flaeche.format(flaeche);
    }

    @Override
    public String toString() {
        return "Dreieck{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", umfang=" + umfang +
                ", flaeche=" + flaeche +

                '}';
    }
}
