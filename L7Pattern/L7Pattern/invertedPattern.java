// package L7Pattern;
// package Advance-DSA;

// public class invertedPatterns {
//     public static void main(String[] args) {
//         int n = 7;
//         for (int line = 1; line <= n; line++) {
//             for (int i = n; i >= 1; i--) {
//                 System.out.print("*");
//             }
//             System.err.println();
//         }
//     }
// }
// public class invertedPatterns {

//     public static void main(String[] args) {
//         int n = 7;
//         for (int line = 1; line <= n; line++) {

//             for (int i = n - line; i >= 1; i--) {
//                 System.out.print("*");
//             }

//             System.err.println();
//         }
//     }
// }





package L7Pattern;
public class invertedPattern {

    public static void main(String[] args) {
        int n = 7;
        for (int line = 1; line <= n; line++) {

            for (int star = 1; star <= n - line+1; star++) {
                System.out.print("*");
            }

            System.err.println();
        }
    }
}
