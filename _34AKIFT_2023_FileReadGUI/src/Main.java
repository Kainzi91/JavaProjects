public class Main {
    public static void main(String[] args) {
        //Oberfläche anlegen
        GUIDatei gui=new GUIDatei();
        //Dateilesen
        DateiLesen datei=new DateiLesen(".\\src\\DateiLesen.java");
        //Debug output
        System.out.println(datei.getInhalt());
    }
}