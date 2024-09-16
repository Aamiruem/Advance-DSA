// package L3Week3Practice.practice1;

import java.util.Scanner;
public class FindDigitSum {
    public static int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int sum = getSum(num);
            System.out.println("The sum of the digits in " + num + " is: " + sum);
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

            // Handle specific exceptions
            if (e instanceof NumberFormatException) {
                System.err.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
