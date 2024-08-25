// package Advance-DSA.L3Operators;

// public class Assignment {
//     public static void main(String[] args) {
//         int x = 10;
//         int y = 20;
        
//         // Addition
//         int sum = x + y; //x+=y (x = sum)
//         System.out.println("Sum: " + sum);
        
//         // Subtraction
//         int difference = x - y; //x-=y (difference = x)
//         System.out.println("Difference: " + difference);
        
//         // Multiplication
//         int product = x * y; //x*=y (product = x)
//         System.out.println("Product: " + product);
        
//         // Floor Division
//         int quotient = x / y;   // x/=y (quotient = x)
//         System.out.println("Quotient (floor division): " + quotient);
        
//         // Modulus
//         int remainder = x % y; // x%=y (remainder = x)
//         System.out.println("Remainder: " + remainder);
        
//         // Exponentiation
//         int exponentiation = (int) Math.pow(x, y); 
//         System.out.println("Exponentiation: " + exponentiation);
//     }
// }












public class Assignment {
    public static void main(String[] args) {
        int x , y, z;
        x = y = z = 2;
        
        // Addition
        x += y;
        System.out.println("x: " + x); // x = 4
        
        // Subtraction
        y -= x;
        System.out.println("y: " + y); // y = 0
        
        // Multiplication
        z *= y;
        System.out.println("z: " + z); // z = 0
        
        // Floor Division
        x /= z;
        System.out.println("x: " + x); // x = 0
        
        // Modulus
        y %= x;
        System.out.println("y: " + y); // y = 0
        
        // Exponentiation
        z = (int) Math.pow(x, y);
        System.out.println("z: " + z); // z = 0

    }
}
