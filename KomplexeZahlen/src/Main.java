public class Main {
    public static void main(String[] args) {

        Komplex z1=new Komplex(-5,-5);
        Komplex z2=new Komplex(-3,-3);
        Komplex z_summe=new Komplex();
        System.out.println("z1="+z1.viewComp());
        z1.getKonjugiertKomplex();

        Komplex z1_konjugiert = z1.getKonjugiertKomplex();
        System.out.println("z1*="+z1_konjugiert.viewComp());
        System.out.println("z1_trig="+z1.viewTrigComp());
        System.out.println("z1_ex="+z1.viewExComp());
        z_summe=z1.getSumme(z2);
        System.out.println(z_summe.viewComp());
       z_summe=z1.getDifferenz(z2);
        System.out.println(z_summe.viewComp());


}
}