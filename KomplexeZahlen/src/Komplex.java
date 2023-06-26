import java.text.DecimalFormat;

public class Komplex {

    private double a = 0;
    private double b = 0;

    private double r=0.00d;
    private double phi=0.00d;
    protected DecimalFormat f = new DecimalFormat("#0.00");
    public Komplex() {
    }

    public Komplex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */

    public String viewComp(){
        if(b<0){
        return a+""+b+"j";
        }
        else return a+"+"+b+"j";

    }
    public String viewTrigComp(){
        String trig= calcTrig();
        return trig;
    }
    public String viewExComp(){
        String ex= calcExpForm();
        return ex;
    }
    private double calcR(){

      this.r=Math.sqrt((Math.pow(a,2))+Math.pow(b,2));
      return r;
    }
    private String calcExpForm(){

        String expForm= f.format(r)+"e^j*"+f.format(calcPhi());
    return expForm;
    }
    private double calcPhi(){
        this.phi=Math.toDegrees(Math.atan(b/a));
        this.phi= (this.phi<0) ?this.phi+360:this.phi;
        return phi;
    }
    private String calcTrig(){
        double r=calcR();
        double  phi=calcPhi();

     String trigForm= f.format(r)+"*" + "(cos("+f.format(phi)+")+j*(sin("+f.format(phi)+"))";
     return trigForm;
    }

    public Komplex getKonjugiertKomplex(){
        Komplex zahl=new Komplex();
        zahl.a=this.a;
        zahl.b=(-1)*this.b;
        return zahl;
    }

    public Komplex getSumme(Komplex z){

        Komplex Summe=new Komplex();

        Summe.setA(this.a+ z.getA());
        Summe.setB(this.b+ z.getB());

        return Summe;
    }
    public Komplex getDifferenz(Komplex z){

        Komplex Differenz=new Komplex(a,b);
        Differenz.setA(this.a- z.getA());
        Differenz.setB(this.b- z.getB());

        return Differenz;
    }
    public Komplex getQuotient(Komplex z){
        Komplex quotient = new Komplex();

        double nenner = Math.pow(z.getA(),2)+Math.pow(z.getB(),2);

        quotient.setA(a*z.getA()+b*z.getB()/nenner);
        quotient.setB(b*z.getA()+a*z.getB()/nenner);

        return quotient;
    }
    public Komplex getProdukt(Komplex z){
        Komplex produkt = new Komplex();

        produkt.setA(z.getA()*a-z.getB()*b);
        produkt.setB(b*z.getA()+a*z.getB());

        return produkt;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

