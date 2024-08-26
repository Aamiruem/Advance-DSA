// package Advance-DSA.L4GFGOperators;

// condition ? if true : if false
// public class Ternary {
//     public static void main(String[] args) {
//         int a = 20, b = 10, c = 30, result;
//         // result holds max of three
//         // numbers
//         result
//                 = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
//         System.out.println("Max of three numbers = "
//                 + result);
//     }
// }







public class Ternary {

    public static void main(String[] args) {
        // Declare and initialize three integers
        int a = 20, b = 10, c = 30, result;

        // Use nested ternary operators to find the maximum of three numbers
        // First, it checks if 'a' is greater than 'b'.
        // If true, it checks if 'a' is greater than 'c'.
        // - If 'a' is greater than both, 'a' is the result.
        // - Otherwise, 'c' is the result.
        // If 'a' is not greater than 'b', it checks if 'b' is greater than 'c'.
        // - If 'b' is greater than 'c', 'b' is the result.
        // - Otherwise, 'c' is the result.
        result = (a > b)
                ? (a > c) ? a : c
                : (b > c) ? b : c;

        // Print the maximum value among the three numbers
        System.out.println("Max of three numbers = " + result);
    }
}
