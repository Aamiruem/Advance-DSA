
import java.util.Scanner;

public class NumberPatterns {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: "); // Get input from user
            int n = sc.nextInt();

            // Outer loop for each line
            for (int line = n; line >= 1; line--) {
                // Inner loop for printing numbers in each line
                for (int number = 1; number <= line; number++) {
                    System.out.print(number + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
