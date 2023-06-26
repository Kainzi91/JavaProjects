import java.util.Arrays;

public class Lotto extends Zufall{

    private int[] myZahlen = new int[6];

    public Lotto(){
    }

    public int[] getMyZahlen() {
        intArray();
        Arrays.sort(myZahlen);
        return myZahlen;
    }

    private void intArray() {
        int cnt = 0;
        boolean bereitsVorhanden = false;
        Zufall myZufall = new Zufall(1,45);
        while (cnt < 6) {
            int helper = myZufall.getZufallswert();
            if(helper < 46 && helper > 0){
                if(cnt == 0){
                    myZahlen[cnt] = helper;
                    cnt++;
                } else {
                    for(int i = 0; i < cnt; i++){
                        if(myZahlen[i] == helper){
                            bereitsVorhanden = true;
                        }
                    }
                    if(bereitsVorhanden){
                        bereitsVorhanden = false;
                    } else {
                        myZahlen[cnt] = helper;
                        cnt++;
                    }
                }
            }
        }
    }

    public int getZufalszahlenFueTextFeld(int pos){
        return myZahlen[pos];
    }

    public int[] getToVergleich(){
        return myZahlen;
    }

}
