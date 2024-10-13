// package L7Pattern;
// package Advance-DSA;
// import java.util.Scanner;

// public class zeroOneTriangle {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter the number of line ");
//             int n = sc.nextInt();

//             for (int line = 0; line <= n; line++) {
//                 for (int number = 0; number <= line; number++) {
//                     if ((line + number) % 2 == 0 || number % 2 == 0) {
//                         System.out.print(0 + " ");
//                     } else {
//                         System.out.print(1 + " ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }













package L7Pattern;
import java.util.Scanner;

public class zeroOneTriangles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of line ");
            int n = sc.nextInt();

            for (int line = 1; line <= n; line++) {
                for (int number = 1; number <= line; number++) {
                    if ((line + number) % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
