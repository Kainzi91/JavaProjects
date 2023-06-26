public class Burgenland extends Österreich {

    String Sprache;

    public Burgenland() {

    }

    public Burgenland(int einwohner, double groeße, String sprache) {
        super(einwohner, groeße);
        Sprache = sprache;
    }

    @Override
    public void gruessen() {
        System.out.println("Hallo ich bins geili!");
    }

    public String getSprache() {
        return Sprache;
    }
}
