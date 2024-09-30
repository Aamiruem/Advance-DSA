package L1BasicsCode.L1BasicsCode.L3Week3Practice.practice2.practice1;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt(); //rows = n

            System.out.print("Enter the number of columns: ");
            int m = sc.nextInt(); //column = m

            for (int i = 1; i <= n; i++) {
                if(i == 1 || i == n) {
                    for (int j = 1; j <= m; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int j = 2; j < m; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}


// import java.util.Scanner;

// public class HollowRectangle {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter the number of rows: ");
//             int rows = sc.nextInt();

//             System.out.print("Enter the number of columns: ");
//             int columns = sc.nextInt();

//             // Loop for each row
//             for (int i = 1; i <= rows; i++) {
//                 // Loop for each column
//                 for (int j = 1; j <= columns; j++) {
//                     // Print * for border or space for inside
//                     if (i == 1 || i == rows || j == 1 || j == columns) {
//                         System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 }
//                 // Move to the next line
//                 System.out.println();
//             }
//         }
//     }
// }
