public class Zufall {
    private int von;
    private int bis;
    private int zufallswert;

    /**
     * default constructor
     */
    public Zufall() {
        init();
    }

    /**
     * @param von
     * @param bis
     */
    public Zufall(int von, int bis) {
        this.von = von;
        this.bis = bis;
    }

    public void setVon(int von) {
        this.von = von;
    }

    public void setBis(int bis) {
        this.bis = bis;
    }

    public int getVon() {
        return von;
    }

    public int getBis() {
        return bis;
    }

    public int getZufallswert() {
        System.out.println("DEBUG: Wert="+generieren());
        return zufallswert;
    }

    /**
     * Initialisierung der Attribute
     */
    private void init()
 {
     von=bis=zufallswert=0;
 }
 private double generieren(){

        return (int)(von+Math.random()*(bis-von+1));
 }
}
