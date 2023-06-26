import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String help = """
                    
                """;
        System.out.println(help);
        while (true) {
            double a = 0, b = 0;
            String input = scanner.next();

            switch (input) {
                case "x":
                    System.exit(0);
                case "e":
                    readValues(a,b);
                    break;
                case "h":
                    readValues(a,b);
                    System.out.println("a^b = " + Math.pow(a, b));
                    break;
                case "r":
                    readValues(a,b);
                    break;
                case "d":
                    readValues(a,b);
                    break;
                default:
                    System.out.println(help);
            }
        }
    }

    private static void readValues(double a, double b) {
        System.out.println("insert a:");
        a = scanner.nextDouble();
        System.out.println("insert b:");
        b = scanner.nextDouble();
    }
}