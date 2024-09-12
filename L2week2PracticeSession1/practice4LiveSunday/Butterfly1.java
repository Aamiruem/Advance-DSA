package L2week2PracticeSession1.practice4LiveSunday;

// package practice4LiveSunday;

// import java.util.Scanner;
// public class Butterfly {
//     public static void main(String[] args) {
//         Scanner sc;
//         sc = new Scanner(System.in);
//         System.out.print("Enter the number of Butterflies: ");
//         // numButterflies = n
//         int n = sc.nextInt();
//         int st = 1;
//         int sp = 2 * n - 2;
//         // int sp = 2 * n;
//         // int number_of_line = 1;
//         for (int number_of_line = 1; number_of_line < 2 * n-2; number_of_line++) {
//             // print star
//             for (int i = 1; i <= st; i++) {
//                 System.out.print("*");
//             }
//             // print space
//             for (int i = 1; i <= sp; i++) {
//                 System.out.print(" ");
//             }
//             // print star
//             for (int i = 1; i <= st; i++) {
//                 System.out.print("*");
//             }
//             if (number_of_line < n) {
//                 st++;
//                 sp -= 2; //sp = sp-2;
//             } else {
//                 st--;
//                 sp += 2; //sp = sp+2;
//             }
//             // new line after each line
//             System.out.println();
//         }
//         sc.close();
//     }
// }




import java.util.Scanner;

public class Butterfly1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows for the butterfly pattern: ");
            int n = sc.nextInt();
            int st = 1;
            int sp = 2 * n - 2;
            int number_of_line = 1;
            // Upper half of the butterfly
            while (number_of_line <= 2 * n) {
                // Print stars on the left side
                for (int i = 1; i <= st; i++) {
                    System.out.print("*");
                }
                // Print spaces in the middle
                for (int i = 1; i <= sp; i++) {
                    System.out.print(" ");
                }
                // Print stars on the right side
                for (int i = 1; i <= st; i++) {
                    System.out.print("*");
                }

                // Increase the number of stars and decrease spaces for the next line
                
                if (number_of_line < n) {
    
                    st++;
                    sp -= 2;
                } else {
                    st--;
                    sp += 2;
                }
                number_of_line++;
                System.out.println();
            }

        }
    }
}
