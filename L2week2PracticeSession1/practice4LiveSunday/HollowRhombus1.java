package L2week2PracticeSession1.practice4LiveSunday;


import java.util.Scanner;

public class HollowRhombus1 {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc; 
        sc = new Scanner(System.in);

        // Prompt the user to enter the number of lines
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt(); // Take input for the number of lines

        // Initialize variables for outer spaces and inner spaces
        int osp = n - 1; // Outer spaces before stars
        int isp = n - 2; // Inner spaces between stars (only for middle rows)

        // Start from the first line
        int number_of_line = 1;

        // Loop through all the lines
        while (number_of_line <= n) {
            // Print outer spaces
            for (int i = 0; i < osp; i++) {
                System.out.print(" ");
            }

            // For the first and last line, print a full row of stars
            if (number_of_line == 1 || number_of_line == n) {
                for (int i = 0; i < n; i++) {
                    System.out.print("* ");
                }
            } else {
                // For middle lines:
                // Print the first star
                System.out.print("*");

                // Print inner spaces (double spaces because of the rhombus structure)
                for (int i = 0; i < isp; i++) {
                    System.out.print("  ");
                }

                // Print the last star
                System.out.print(" *");
            }

            // Move to the next line
            System.out.println();

            // Decrease outer space for the next line
            osp--;

            // Move to the next line
            number_of_line++;
        }

        // Close the Scanner object
        sc.close();
    }
}
