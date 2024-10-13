package L8Function;

import java.util.Scanner;

public class SolidRhombus1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows for the rhombus pattern: ");
            int n = sc.nextInt();

            // Outer loop for number of rows
            for (int i = 1; i <= n; i++) {

                // Print leading spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }

                System.out.println();  // Move to the next line
            }
        }
    }
}
