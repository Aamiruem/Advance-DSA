import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the range (e.g., 10 to calculate sum of odd/even numbers up to 10): ");
            int range = input.nextInt();

            for (int i = 1; i <= range; i++) {
                if (i % 2 == 0) {
                    evenSum += i; // Add to even sum if the number is even
                } else {
                    oddSum += i; // Add to odd sum if the number is odd
                }
            }

            System.out.println("Sum of even numbers up to " + range + ": " + evenSum);
            System.out.println("Sum of odd numbers up to " + range + ": " + oddSum);
        }
    }
}
