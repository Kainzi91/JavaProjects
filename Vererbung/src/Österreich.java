public class Österreich {

    private int Einwohner;
    private double Groeße;

    public Österreich() {
    }

    public Österreich(int einwohner, double groeße) {
        Einwohner = einwohner;
        Groeße = groeße;
    }

    public void gruessen() {

        System.out.println("Serwus");

    }

    public void setEinwohner(int einwohner) {
        Einwohner = einwohner;
    }

    public void setGroeße(double groeße) {
        Groeße = groeße;
    }

    public int getEinwohner() {
        return Einwohner;
    }

    public double getGroeße() {
        return Groeße;
    }
}
