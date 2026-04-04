import java.util.Scanner;

public class FiveNum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int largest = Integer.MIN_VALUE;

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                if (num > largest) {
                    largest = num;
                }
            }

            System.out.println("Largest number is: " + largest);
        }
    }
}
