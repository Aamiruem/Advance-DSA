

// import java.util.Scanner;
// public class EvenSumAndOddSum {
//     public static void main(String[] args) {
//         Scanner input;
//         input = new Scanner(System.in);
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do{
//             System.out.println("Enter the number: ");

//             int number = input.nextInt();
//             if(number % 2 == 0){
//                 evenSum += number;
//             } else{
//                 oddSum += number;
//             }
//             System.out.println("Do you want to continue? ( pres 1 for Yes, and 0 for No)?");
//             System.out.println("Enter your choice: ");
//             choice = input.nextInt();

//         } while (choice == 1);
        
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//         input.close();
//     }
// }






import java.util.Scanner;

public class EvenSumAndOddSum {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in); // Initialize the scanner
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        int totalSum = 0; // Variable to keep track of the total sum

        // Continue to accept numbers from the user
        do {
            System.out.println("Enter the number: ");
            int number = input.nextInt(); // Read user input

            // Determine if the number is even or odd and add to the appropriate sum
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            // Add the number to the total sum
            totalSum += number;

            // Prompt the user to continue or stop
            System.out.println("Do you want to continue? (Press 1 for Yes, and 0 for No): ");
            choice = input.nextInt(); // Read user choice

        } while (choice == 1); // Continue if the user enters 1

        // Print the sums of even and odd numbers and the total sum
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Total sum of all numbers: " + totalSum);

        input.close(); // Close the scanner
    }
}
