public class Steiermark  extends Österreich {

    String Sprache;
    public Steiermark() {
    }

    public Steiermark(int einwohner, double groeße,String Sprache) {
        super(einwohner, groeße);
        this.Sprache=Sprache;
    }

    @Override
    public void gruessen()
    {

        System.out.println("Sers i bims a Steirer");
    }
    public String getSprache() {
        return Sprache;
    }
}
