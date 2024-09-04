// package L2week2PracticeS-practice3;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("enter number ");
            int n = sc.nextInt();
            int st = 1;
            int sp = n - 1;
            int number_of_line = 1;

            while (number_of_line <= n) {
                //print space
                for (int j = 1; j <= sp; j++) {
                    System.out.print(" ");
                }

                //print space
                for (int j = 1; j <= st; j++) {
                    System.out.print("*");
                }

                st++;
                sp--;

                number_of_line++;
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
