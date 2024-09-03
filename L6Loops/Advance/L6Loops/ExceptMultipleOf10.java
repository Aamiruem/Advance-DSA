// package L6Loops;

import java.util.Scanner;

public class ExceptMultipleOf10 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            do {
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    System.out.println(num + " is a multiple of 10.");
                    continue;
                } else {
                    System.out.println(num + " is not a multiple of 10.");
                }
            } while (true);

        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}







// import java.util.Scanner;

// public class ExceptMultipleOf10 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             while (true) {
//                 System.out.print("Enter a number (or enter 0 to exit): ");
//                 int num = sc.nextInt();
                
//                 if (num == 0) {
//                     System.out.println("Exiting the program.");
//                     break; // Exit the loop if the user enters 0
//                 }
                
//                 if (num % 10 == 0) {
//                     System.out.println(num + " is a multiple of 10.");
//                     continue; // Skip the rest of the loop and ask for a new number
//                 } else {
//                     System.out.println(num + " is not a multiple of 10.");
//                 }
//             }
//         } catch (Exception e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }
