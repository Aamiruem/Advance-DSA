package L8Function;

import java.util.Scanner;

public class ArgumentsAndParameters {
    public static int calculateSum(int num1, int num2) { // num1 and num2 parameter aur formal parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number ");
            int a = sc.nextInt();
            System.out.println("Enter second number ");
            int b = sc.nextInt();
            int sum = calculateSum(a, b); //a nad b arguments aur actual parameters

            System.out.println("Sum is: " + sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
