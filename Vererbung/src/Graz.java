public class Graz extends Steiermark{
    public Graz() {
    }

    public Graz(int einwohner, double groeße, String Sprache) {
        super(einwohner, groeße, Sprache);
    }

    @Override
    public void gruessen()
    {
        System.out.println("Klebe mich gerne auf Straßen");
    }
    public String getSprache() {
        return Sprache;
    }

}
