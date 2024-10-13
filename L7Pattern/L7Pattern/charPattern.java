package L7Pattern;

import java.util.Scanner;

public class charPattern {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter a number ");

            int n = sc.nextInt();
            char ch = 'A';
            for (int line = 1; line <= n; line++) {
                for (int chars = 1; chars <= line; chars++) {
                    System.out.print(ch + " ");
                    ch++;
                }
                System.err.println();
            }
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }
}
