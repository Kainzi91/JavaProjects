public class Rechner {
    private double wert;
    private double arcsinG;
    private double arccosG;
    private double arctanG;
    private double arcsinR;
    private double arccosR;
    private double arctanR;

    /**
     * default Konstruktor
     */
    public Rechner() {
        //default wert ist 0
        setWert(0);
    }

    /**
     * Konstruktor
     * @param wert
     */
    public Rechner(double wert) {

        setWert(wert);

    }

    /**
     *
     * @param wert Übernehmen des Werts
     */
    public void setWert(double wert) {
        this.wert = wert;
        berechnungen_trig();
    }

    /**
     *
     * @return Rückgabe des Werts
     */
    public double getWert() {
        return wert;
    }

    public double getArcsinG() {
        return arcsinG;
    }

    public double getArccosG() {
        return arccosG;
    }

    public double getArctanG() {
        return arctanG;
    }

    public double getArcsinR() {
        return arcsinR;
    }

    public double getArccosR() {
        return arccosR;
    }

    public double getArctanR() {
        return arctanR;
    }

    public Rechner getHoch(Rechner exponent) {
        Rechner hoch=new Rechner();
        hoch.wert=Math.pow(this.wert,exponent.wert);
        return hoch;
    }

    private void berechnungen_trig(){
        arcsinR=Math.asin(this.wert);
        arccosR=Math.acos(this.wert);
        arctanR=Math.atan(this.wert);
        //radiant
        arcsinG=Math.toDegrees(arcsinR);
        arccosG=Math.toDegrees(arccosR);
        arctanG=Math.toDegrees(arctanR);
    }

    @Override
    public String toString() {
        return "Rechner{" +
                "wert=" + wert +
                ", arcsinG=" + arcsinG +
                ", arccosG=" + arccosG +
                ", arctanG=" + arctanG +
                ", arcsinR=" + arcsinR +
                ", arccosR=" + arccosR +
                ", arctanR=" + arctanR +
                '}';
    }
}
