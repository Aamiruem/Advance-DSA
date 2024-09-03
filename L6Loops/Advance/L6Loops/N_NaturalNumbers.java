// package L6Loops;

import java.util.Scanner;
public class N_NaturalNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number: ");

            int number = input.nextInt();

            for (int i = 1; i <= number; i++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        System.err.println("Done!");
    }
}
