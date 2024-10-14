// package Advance-DSA.L4GFGOperators;

// * : Multiplication
// / : Division
// % : Modulo
// + : Addition
// – : Subtraction

// import java.util.Scanner;

// public class ArithmeticOperators {

//     public static void main(String[] args) {
//         Scanner sc;
//         sc = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         double num1 = sc.nextDouble();

//         System.out.print("Enter the second number: ");
//         double num2 = sc.nextDouble();

//         double sum = num1 + num2;
//         double difference = num1 - num2;
//         double product = num1 * num2;
//         double quotient = num1 / num2;

//         System.out.println("The sum of the two numbers is: " + sum);
//         System.out.println("The difference of the two numbers is: " + difference);
//         System.out.println("The product of the two numbers is: " + product);
//         System.out.println("The quotient of the two numbers is: " + quotient);

//         sc.close();
//     }
// }




package L4GFGOperators;
public class ArithmeticOperator {
    public static void main(String[] args) {

        // Arithmetic operators
        int a = 10;
        int b = 3;

        System.out.println("Sum of a + b = " + (a + b));
        System.out.println("Difference of a - b = " + (a - b));
        System.out.println("Product of a * b = " + (a * b));
        System.out.println("Division of a / b = " + (a / b));
        System.out.println("Modulus of a % b = " + (a % b));

    }
}
