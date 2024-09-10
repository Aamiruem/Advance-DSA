// package L7Pattern;
// package Advance-DSA;

// import java.util.Scanner;

// public class numberPattern {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.err.println("Enter a number ");

//             int n = sc.nextInt();
//             for (int line = 1; line <= n; line++) {
//                 for (int number = 1; number <= line; number++) {
//                     System.out.print(number + " ");
//                 }
//                 System.err.println();
//             }
//         }catch(Exception error){
//             System.err.println("Error: " + error.getMessage());
//         }
//     }
// }






package L7Pattern;
import java.util.Scanner;

public class numberPattern1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter a number ");

            int n = sc.nextInt();
            for (int line = 1; line <= n; line++) {
                for (int number = 1; number <= line; number++) {
                    System.out.print(number + " ");
                }
                System.err.println();
            }
        }catch(Exception error){
            System.err.println("Error: " + error.getMessage());
        }
    }
}
