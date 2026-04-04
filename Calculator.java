import java.util.Scanner;

public class Calculator {

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) result *= base;
        return result;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                System.out.print("Operation (+, -, *, /, ^): ");
                String op = sc.next();

                double result = switch (op) {
                    case "+" -> add(a, b);
                    case "-" -> subtract(a, b);
                    case "*" -> multiply(a, b);
                    case "/" -> divide(a, b);
                    case "^" -> power(a, (int) b);
                    default -> {
                        System.out.println("Invalid operation.");
                        yield Double.NaN;
                    }
                };

                System.out.println("Result: " + result);

                System.out.print("Another? (y/n): ");
                if (!sc.next().equalsIgnoreCase("y")) break;
            }
        }
    }
}
