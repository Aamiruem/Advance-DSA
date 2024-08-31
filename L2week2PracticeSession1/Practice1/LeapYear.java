// package Advance-DSA.L2week2PracticeSession1.Practice1;

// import java.util.Scanner;
// public class LeapYear {
//     public static void main(String[] args) {
//         Scanner input;
//         input = new Scanner(System.in);
//         System.out.println("Enter the year: ");
//         int year = input.nextInt();
//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     System.out.println(year + " is a leap year");
//                 } else {
//                     System.out.println(year + " is not a leap year");
//                 }
//             } else {
//                 System.out.println(year + " is a leap year");
//             }
//         } else {
//             System.out.println(year + " is not a leap year");
//         }
//         input.close();
//     }
// }













public class LeapYear {

    public static void main(String[] args) {
        int year = 2024; // You can change this value to test different years

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100, unless divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If year is divisible by 100, it should also be divisible by 400 to be a leap year
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
