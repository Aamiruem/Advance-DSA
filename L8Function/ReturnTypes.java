package L8Function;

import java.util.Scanner;

public class ReturnTypes {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number ");
            int a = sc.nextInt();
            System.out.println("Enter second number ");
            int b = sc.nextInt();
            int sum = calculateSum(a, b);

            System.out.println("Sum is: " + sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
