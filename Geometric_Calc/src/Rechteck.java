
    public class Rechteck extends Dreieck{


    public Rechteck() {
    }
    public Rechteck(double a, double b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    protected void flaecheBerechnen()
    {
        this.flaeche= this.a*this.b;
    }
    @Override
    protected void umfangBerechnen()
    {
        this.umfang= 2*(this.a+this.b);
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "a=" + a +
                ", b=" + b +
                ", umfang=" + umfang +
                ", fläche=" + flaeche +
                '}';
    }
}
