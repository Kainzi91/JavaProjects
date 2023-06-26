public class Main {
    public static void main(String[] args) {

        Burgenland B1=new Burgenland(2,1,"Multilanguage");
        Steiermark S1=new Steiermark(4,2,"Stoasteirisch");
        Österreich Oe1=new Österreich(4000,1222);
        Graz G1=new Graz(3,4,"Halo");
        B1.setEinwohner(5000);


        B1.gruessen();
        S1.gruessen();
        Oe1.gruessen();
        G1.gruessen();
        System.out.println("\nB1="+B1.getEinwohner()+"\nS1="+S1.getEinwohner()+"\nOe1="+Oe1.getEinwohner()+"\nG1="+ G1.getEinwohner());
        System.out.println("\nB1="+B1.getSprache()+"\nS1="+S1.getSprache()+"\nG1="+ G1.getSprache());
        ;
    }
}