/**
 * Beispiel: Zufallszahlen mit Würfel
 */
public class Main {
    public static void main(String[] args) {

        Zufall z1=new Zufall();//erzeuge das Objekt z1
        z1.setBis(10);
        z1.setVon(8);
        for (int i = 1; i <=100 ; i++) {
            System.out.println("Zufallswert["+z1.getVon()+";"+z1.getBis()+"]="+z1.getZufallswert());
        }
    }
}
//Würfel dazufügen, komplexe zahlen