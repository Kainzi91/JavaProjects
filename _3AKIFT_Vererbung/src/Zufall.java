import java.util.Random;

public class Zufall {


    private int minZahl=0;
    private int maxZahl=0;

    protected int rdmZahl=0;



    public Zufall() {
     init();
    }

    public Zufall(int minZahl, int maxZahl) {
        this.minZahl = minZahl;
        this.maxZahl = maxZahl;
    }



    private void init(){
     minZahl=maxZahl=rdmZahl=0;
    }

    protected double generieren(){

        return (int)this.minZahl+Math.random()*(this.maxZahl-this.minZahl+1);
    }

    public int getMinZahl() {
        return minZahl;
    }

    public void setMinZahl(int minZahl) {
        this.minZahl = minZahl;
    }

    public int getMaxZahl() {
        return maxZahl;
    }

    public void setMaxZahl(int maxZahl) {
        this.maxZahl = maxZahl;
    }

    public int getRdmZahl() {
       //System.out.println("DEBUG-WERT = "+ generieren());
        rdmZahl=(int)generieren();
        return rdmZahl;
    }
}

