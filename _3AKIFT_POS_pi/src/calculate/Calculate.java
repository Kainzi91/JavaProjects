package calculate;

public class Calculate {
    private double four = 4;
    private double a = 1.0;
    private double b = 3.0;
    private double pi = 0;

    public double calculatePi(long computations) {


        for (int i = 0; i < computations / 2; i++) {
            pi += four / a - four / b;
            a = a + 4;
            b = b + 4;
        }
        return pi;

    }


}
