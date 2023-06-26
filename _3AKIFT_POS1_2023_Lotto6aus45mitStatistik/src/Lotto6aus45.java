import java.util.Arrays;

public class Lotto6aus45 extends Zufall {
    private final int kugel_anzahl=6;
    private int[] ziehung={0,0,0,0,0,0};
    private int zusatzzahl=0;

    /**
     *
     * @return int array 6 aus 45
     */
    public int[] getZiehung() {
        generiere6aus45();
        //Zahlen Sortieren
        Arrays.sort(ziehung);
        return ziehung;
    }

    public int getZusatzzahl() {
        generierezusatzzahl();
        return zusatzzahl;
    }

    public Lotto6aus45() {
        //init
        for(int k=0;k<kugel_anzahl;k++) ziehung[k]=0;
        zusatzzahl=0;
        //setzen der von bis für 6 as 45
        setVon(1);
        setBis(45);
    }

    private void generiere6aus45(){
        //ziehe 6 Kugeln, alle Zahlen müssen verschieden sein
        for(int z=0;z<kugel_anzahl;z++){
            int kugel=this.getZufallswert();
            if(letzteKugelunique(kugel)) ziehung[z]=kugel;else z--;
        }
    }

    private void generierezusatzzahl(){
        //ziehe 1 Kugel, alle Zahlen müssen verschieden sein
        for(int z=0;z<1;z++){
            int kugel=this.getZufallswert();
            if(letzteKugelunique(kugel)) zusatzzahl=kugel;else z--;
        }
    }

    private boolean letzteKugelunique(int wert){
        boolean unique=true;
        //check aus Eindeutigkeit
        for(int i=0;i<kugel_anzahl;i++) if(ziehung[i]==wert) unique=false;

        return unique;
    }

    public int getAuswertung(int[] tipp){
        int gleiche=0;
        //alle Vergleichen
        for(int t=0;t<6;t++){
            for(int z=0;z<6;z++){
                if(tipp[t]==ziehung[z]) gleiche++;
            }
        }

        return gleiche;
    }

    @Override
    public String toString() {
        return "Lotto6aus45{" +
                "ziehung=" + Arrays.toString(ziehung) +
                '}';
    }
}
