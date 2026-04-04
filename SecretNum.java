import java.util.Scanner;

public class SecretNum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int secret = 7;
            int guess = 0;

            while (guess != secret) {
                System.out.print("Guess the number: ");
                guess = sc.nextInt();

                if (guess < secret) {
                    System.out.println("Too low");
                } else if (guess > secret) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Correct!");
                }
            }
        }
    }
}
