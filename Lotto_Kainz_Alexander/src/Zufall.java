
public class Zufall {
    private int von;
    private int bis;
    private int zufallswert;

    /**
     * default Konstruktor
     */
    public Zufall() {
        //initialisierung der Werte
        von=bis=zufallswert=0;
    }

    /**
     * Konstruktor
     * @param von unterer Zufallsbreich
     * @param bis oberer Zufallsbreich
     */
    public Zufall(int von, int bis) {
        this.von = von;
        this.bis = bis;
    }

    /**
     * Get- und Set-Methoden
     * @param von
     */
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
        //erzeuge eine Zufallswert
        zufallswert=(int) generieren();
        //gib ihn zurück
        return zufallswert;
    }
    /**
     Ende Set- und Get- Methoden
     */

    /**
     * Zufallswert erzeugen
     * @return int Zufallswert [von;bis]
     */
    private
    int generieren(){
        return (int)(von+Math.random()*(bis-von+1));
    }

    @Override
    public String toString() {
        return "Zufall{" +
                "von=" + von +
                ", bis=" + bis +
                ", zufallswert=" + zufallswert +
                '}';
    }
}

