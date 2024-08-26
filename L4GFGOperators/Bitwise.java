// package Advance-DSA.L4GFGOperators;

// &, Bitwise AND operator: returns bit by bit AND of input values.
// |, Bitwise OR operator: returns bit by bit OR of input values.
// ^, Bitwise XOR operator: returns bit-by-bit XOR of input values.
// ~, Bitwise Complement Operator: This is a unary operator which returns
public class Bitwise {

    public static void main(String[] args) {
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));

        System.err.println();
        System.out.println("~d: " + (~d));

        
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));
    }
}
