import java.util.ArrayList;
import java.util.Collections;

public class Ziehung extends Zufall {

    private ArrayList<Integer> RandomLottoZahlen = new ArrayList<Integer>();
    public Ziehung() {
    }

    public ArrayList<Integer> getRandomLottoZahlen() {
        return RandomLottoZahlen;
    }


    private void addNumbers() {
        setVon(1);
        setBis(45);

        while(RandomLottoZahlen.size()<6){
          int Zufallszahl=getZufallswert();

           if (!RandomLottoZahlen.contains(Zufallszahl)){
            RandomLottoZahlen.add(Zufallszahl);
           }
        }
    }


    public int compare(ArrayList<Integer> meineZahlen){
        int counter=0;

        for (int i=0 ; i <6;i++)
       {
           for (int j = 0; j <6 ; j++)
           {
                if (this.RandomLottoZahlen.get(i).compareTo(meineZahlen.get(j))==0)
                {
                    counter++;

               }
           }
       }
    return counter;
    }
    public ArrayList<Integer> getNumbers(){
        addNumbers();
        Collections.sort(RandomLottoZahlen);

        return this.RandomLottoZahlen;
    }



}