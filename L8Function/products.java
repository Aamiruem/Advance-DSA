package L8Function;

import java.util.Scanner;

public class products {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            int product = multiply(a, b);
            System.out.println("product of a and b = " + product);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
