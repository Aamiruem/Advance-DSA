// package L7Pattern;
// // write  two numbers sum

// import java.util.Scanner;

// public class EvenSumAndOddSum {

//     public static void main(String[] args) {

//         Scanner input;
//         input = new Scanner(System.in);
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
//         int evenNum = 0;
//         int oddNum = 0;

//         do {
//             System.out.println("Enter the number: ");

//             int number = input.nextInt();
//             if (number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }
//             System.out.println("Do you want to continue? ( pres 1 for Yes, and 0 for No)?");
//             System.out.println("Enter your choice: ");
//             choice = input.nextInt();

//         } while (choice == 1);

//         System.out.println("Sum of even numbers upto: " + evenNum + evenSum);
//         System.out.println("Sum of odd numbers: upto "+ oddNum + oddSum);
//         input.close();
//     }
// }









package L7Pattern;
import java.util.Scanner;

public class EvenSumAndOddSum1 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int choice;
            int evenSum = 0;
            int oddSum = 0;
            int evenCount = 0;
            int oddCount = 0;
            
            do {
                System.out.println("Enter the number: ");
                int number = input.nextInt();
                
                if (number % 2 == 0) {
                    evenSum += number;
                    evenCount++;
                } else {
                    oddSum += number;
                    oddCount++;
                }
                
                System.out.println("Do you want to continue? (press 1 for Yes, and 0 for No): ");
                choice = input.nextInt();
                
            } while (choice == 1);
            
            // Print the sums of even and odd numbers
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Total number of even numbers entered: " + evenCount);
            System.out.println("Sum of odd numbers: " + oddSum);
            System.out.println("Total number of odd numbers entered: " + oddCount);
        }
    }
}
