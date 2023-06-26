import java.util.Arrays;

public class Statistik {

    private int[] haeufigkeit_abs={0,0,0,0,0,0,0};
    private double [] haeufigkeit_rel={0,0,0,0,0,0,0,0,0,0,0,0,0};

    private  int anzahlDerRichtigen;
    private int anzahlDerZiehungen;

    public Statistik() {
    anzahlDerZiehungen=anzahlDerRichtigen=0;
    }

    public void setAnzahlDerRichtigen(int anzahlDerRichtigen) {
        if (anzahlDerRichtigen>=0 && anzahlDerRichtigen<=6) {
            haeufigkeit_abs[anzahlDerRichtigen]++;
            anzahlDerZiehungen++;
            this.anzahlDerRichtigen = anzahlDerRichtigen;
        }
    }

    public int[] getHaeufigkeit_abs() {
        return haeufigkeit_abs;
    }

    public double[] getHaeufigkeit_rel() {
        if (anzahlDerZiehungen>0){
        for (int i = 0; i < 6; i++) haeufigkeit_rel[i]=(double) haeufigkeit_abs[i]/anzahlDerZiehungen;
        }
        return haeufigkeit_rel;
    }

    public int getAnzahlDerZiehungen() {
        return anzahlDerZiehungen;
    }

    @Override
    public String toString() {

        return "Statistik{" +
                "haeufigkeit_abs=" + Arrays.toString(haeufigkeit_abs) +
                ", haeufigkeit_rel=" + Arrays.toString(getHaeufigkeit_rel()) +
                ", anzahlDerRichtigen=" + anzahlDerRichtigen +
                ", anzahlDerZiehungen=" + anzahlDerZiehungen +
                '}';
    }
}
