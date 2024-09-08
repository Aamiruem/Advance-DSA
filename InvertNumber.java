// package Advance-DSA;

// import java.util.Scanner;

// public class InvertNumber {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.err.println("Enter a number ");

//             int n = sc.nextInt();
//             for (int line = 0; line <= n; line++) {
//                 for (int number = n - line + 1; number >= 1; number--) {
//                     System.out.print(number + " ");
//                 }
//                 System.err.println();
//             }
//         } catch (Exception error) {
//             System.err.println("Error: " + error.getMessage());
//         }
//     }
// }






// import java.util.Scanner;

// public class InvertNumber {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.err.println("Enter a number ");

//             int n = sc.nextInt();
//             for (int line = n; line >=1; line--) {
//                 for (int number = n - line + 1; number >= 1; number--) {
//                     System.out.print(number + " ");
//                 }
//                 System.err.println();
//             }
//         } catch (Exception error) {
//             System.err.println("Error: " + error.getMessage());
//         }
//     }
// }









import java.util.Scanner;

public class InvertNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter a number ");

            int n = sc.nextInt();
            for (int line = n; line >=1; line--) {
                for (int number = 1; number <= line; number++) {
                    System.out.print(number + " ");
                }
                System.err.println();
            }
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }
}
