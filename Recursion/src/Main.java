public class Main {
    public static void main(String[] args) {
        int num = 10;
        int result = factorial(num);
        int resultFib = fibonacci(num);
        System.out.println("Die Fakultät von " + num + " ist " + result + ".");
        System.out.println("Die Fibonanci-Zahl von " + num + " ist " + resultFib + ".");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
}
}

