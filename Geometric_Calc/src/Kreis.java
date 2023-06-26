
public class Kreis extends Dreieck {

    public Kreis() {
    }
    public Kreis(double r)
    {
        this.a=r;
    }
    @Override
    protected void flaecheBerechnen()
    {

        this.flaeche= Math.pow(this.a,2)*Math.PI;
    }
    @Override
    protected void umfangBerechnen() {

        this.umfang = 2 * this.a * Math.PI;
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "r=" + a +
                ", umfang=" + umfang +
                ", flaeche=" + flaeche +
                '}';
    }
}
