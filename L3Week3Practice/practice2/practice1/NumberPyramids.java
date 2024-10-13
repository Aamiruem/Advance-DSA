package L1BasicsCode.L1BasicsCode.L3Week3Practice.practice2.practice1;

// Import the Scanner class to read user input
import java.util.Scanner;

// Define a public class named NumberPyramids
public class NumberPyramids {
    // Main method where program execution begins
    public static void main(String[] args) {
        // Try-with-resources statement to ensure Scanner is closed after use
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user to enter the number of rows for the pyramid
            System.out.print("Enter the number of rows: ");

            // Read an integer from user input and store it in variable 'rows'
            int rows = input.nextInt();

            // Outer loop to iterate over each row of the pyramid
            for (int line = 1; line <= rows; line++) {
                // Inner loop to iterate over each column in the current row
                for (int j = 0; j <= 2 * line - 1; j++) {
                    // Check if the current column index 'j' is even
                    if (j % 2 == 0) {
                        // Print the current row number followed by a space
                        System.out.print(line + " ");
                    }
                }
                // Print a new line after printing all columns for this row
                System.out.println();
            }
        }
    }
}
