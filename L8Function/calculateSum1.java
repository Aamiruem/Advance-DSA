package L8Function;

import java.util.Scanner;

public class calculateSum1 {
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number ");
            int a = sc.nextInt();
            System.out.println("Enter second number ");
            int b = sc.nextInt();

            calculateSum(a, b);
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
