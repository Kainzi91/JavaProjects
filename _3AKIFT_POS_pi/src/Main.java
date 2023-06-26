import calculate.Calculate;

public class Main {
    public static void main(String[] args) {

        Calculate be = new Calculate();

        long start = System.currentTimeMillis();
        System.out.println("pi=" + be.calculatePi(10000000));
        long end = System.currentTimeMillis();


        System.out.println("time=" + (end - start) + "ms");
    }
    // STRG+ALT+L Autoformat

}

