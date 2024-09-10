package L8Function;

import java.util.Scanner;

public class factorials {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        //direct function call without user
        int m = 5;
        int f = factorial(m);
        System.out.println("Factorial of " + m + " is " + f);

//or
        // take input from user
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int fact = factorial(n);
            System.out.println("factorial of " + n + " is " + fact);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
