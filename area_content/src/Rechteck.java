public class Rechteck {


    private double a;
    private double b;
    private double umfang;
    private double fläche;

    public Rechteck() {
        a = 2.5d;
        b = 3.2d;
        umfang = 0.0d;
        fläche = 0.0d;

    }

    public Rechteck(double a, double b) {
        setA(a);
        setB(b);
    }

    private double Flaeche() {

        return this.a * this.b;
    }

    private double Umfang() {

        return (2 * (this.a + this.b));

    }

    /**
     * @param a Seite des Rechtecks
     * @Version 1.0
     * @author KA
     */
    public void setA(double a) {
        if (a >= 0.0d ) {
            this.a = a;
        } else System.out.println("Error a<0");
    }
    /**
     * @param b Seite des Rechteck
     * @Version 1.0
     * @author KA
     */
    public int setB(double b) {
        if (b >= 0.0d) {
            this.b = b;
            return 0;
        } else {
            System.out.println("Error b<0");
            return -1;
        }
    }

    public double getUmfang() {
        umfang = Umfang();
        return umfang;
    }

    public double getFläche() {
        fläche = Flaeche();
        return fläche;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    @Override
    public String toString() {
        return "Rechteck{" +
                "a=" + a +
                ", b=" + b +
                ", umfang=" + umfang +
                ", fläche=" + fläche +
                '}';
    }
}
