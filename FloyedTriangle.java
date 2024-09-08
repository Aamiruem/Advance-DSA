// package Advance-DSA;

import java.util.Scanner;

public class FloyedTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter the number of line ");

            int n = sc.nextInt();
            int num = 1;

            for (int line = 1; line <= n; line++) {
                for (int number = 1; number <= line; number++) {
                    System.out.print(num + " ");
                    num++;   
                }
                System.err.println();
            }
        }
    }
}
