import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random myRandom= new Random();

        System.out.println("Random double"+ myRandom.nextLong(10));

        Zufall z =new Zufall();
        z.setMinZahl(8);
        z.setMaxZahl(10);

        System.out.println(z.getRdmZahl());

        Würfel w=new Würfel();

        System.out.println(w.getRdmZahl()+" gewürfelt");

    }


}