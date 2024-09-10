package L3Week3Practice.practice1;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the starting number: ");
            int num = sc.nextInt();
            int originalNum = num;
            int rev_num = 0;
            while (num != 0) {
                int digit = num % 10;
                rev_num = rev_num * 10 + digit;
                num = num / 10;
            }
            if (num == rev_num) {
                System.out.println(originalNum + " is a palindrome number.");
            } else {
                System.out.println(originalNum + " is a palindrome number.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            System.exit(1);
        }
    }
}



// package L3Week3Practice.practice1;

// import java.util.Scanner;

// public class PalindromeNumbers {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter the number: ");
//             int num = sc.nextInt();
//             int originalNum = num; // Store the original number
//             int rev_num = 0;

//             // Reverse the number
//             while (num != 0) {
//                 int digit = num % 10;
//                 rev_num = rev_num * 10 + digit;
//                 num = num / 10;
//             }

//             // Check if original number is equal to reversed number
//             if (originalNum == rev_num) {
//                 System.out.println(originalNum + " is a palindrome number.");
//             } else {
//                 System.out.println(originalNum + " is not a palindrome number.");
//             }
//         } catch (Exception e) {
//             System.out.println("Invalid input. Please enter an integer.");
//         }
//     }
// }
