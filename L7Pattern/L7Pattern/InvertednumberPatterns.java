package L7Pattern;
// package Advance-DSA;

import java.util.Scanner;

public class InvertednumberPatterns {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter a number ");

            int n = sc.nextInt();
            for (int line = 1; line <= n; line++) {
                for (int number = line; number >=1; number--) {
                    System.out.print(number + " ");
                }
                System.err.println();
            }
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }
}
