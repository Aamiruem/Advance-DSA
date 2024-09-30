package L1BasicsCode.L2week2PracticeSession1.practice4LiveSunday;

// import java.util.Scanner;

// public class Diamond {

//     public static void main(String[] args) {
//         Scanner sc;
//         sc = new Scanner(System.in);

//         System.out.print("Enter the number of lines: ");
//         int n = sc.nextInt();
//         int st = 1;
//         int sp = n - 1; // n-1 1 st aur 3 sp ke liye

//         for (int number_of_line = 1; number_of_line <= 2 * n - 1; number_of_line++) { // 2times n - 1; lena hai because upper + lower diamond hai 

//             //print space
//             for (int i = 0; i < sp; i++) {
//                 System.out.print(" ");
//             }

//             // print stars
//             for (int i = 0; i < st; i++) {
//                 System.out.print("*");
//             }
//             // next line
//             if (number_of_line < n) {
//                 st += 2;
//                 sp--;
//             } else {
//                 st -= 2;
//                 sp++;
//             }

//             System.out.println();

//         }

//         sc.close();
//     }
// }







// Importing the Scanner class from the java.util package for taking user input
import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc;
        sc = new Scanner(System.in); // Initializing the Scanner object

        // Prompt the user to enter the number of lines for the diamond's upper half
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt(); // Store the input (number of lines) in variable 'n'

        // Initialize variables:
        // 'st' keeps track of the number of stars to be printed, starting from 1.
        int st = 1;
        // 'sp' keeps track of the number of spaces before the stars, starting from (n - 1).
        int sp = n - 1;

        // Loop to print each line of the diamond
        // The loop runs from 1 to (2 * n - 1) to cover both the upper and lower parts of the diamond
        for (int number_of_line = 1; number_of_line <= 2 * n - 1; number_of_line++) {

            // Inner loop to print spaces before the stars
            // It runs 'sp' times, printing spaces (' ')
            for (int i = 0; i < sp; i++) {
                System.out.print(" "); // Print a space character for each iteration
            }

            // Inner loop to print stars ('*')
            // It runs 'st' times, printing stars
            for (int i = 0; i < st; i++) {
                System.out.print("*" + ""); // Print a star character for each iteration
            }

            // Move to the next line after printing stars and spaces for the current line
            System.out.println();

            // Update the values of 'st' and 'sp' for the next line
            // For the upper part of the diamond (before reaching the center line):
            if (number_of_line < n) {
                st += 2; // Increase the number of stars by 2
                sp--;    // Decrease the number of spaces by 1
            } 
            // For the lower part of the diamond (after the center line):
            else {
                st -= 2; // Decrease the number of stars by 2
                sp++;    // Increase the number of spaces by 1
            }
        }

        // Close the Scanner object to avoid memory leaks
        sc.close();
    }
}
