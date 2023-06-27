public class RangListe {
    private String rang;
    private int wert;

    public RangListe() {
    }

    public void setWert(int wert) {
        if(wert>=0 &&wert <=99) rang="E";
        else if(wert>=100 &&wert <=1000) rang="Z";
        else if(wert>=1001 &&wert <=10000) rang="D";
        else throw new IllegalArgumentException();

        this.wert = wert;
    }

    public String getRang() {
        return rang;
    }
}
