public class Vergleich extends Zufall{

    private int richtigeZahlen;

    public Vergleich(){
    }

    public int derVergleich(int[] array, int[] array2) {
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (array[i] == array2[j]) {
                    cnt++;
                }
            }
        }
        this.richtigeZahlen = cnt;
        return cnt;
    }

    public int getRichtigeZahlen() {
        return richtigeZahlen;
    }
}
