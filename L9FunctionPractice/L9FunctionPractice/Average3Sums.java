// package L9FunctionPractice;

import java.util.Scanner;

public class Average3Sums {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int x = input.nextInt();
            System.out.print("Enter the second number: ");
            int y = input.nextInt();
            System.out.print("Enter the third number: ");
            int z = input.nextInt();
            double average = (x + y + z) / 3;
            System.out.println("Average is: " + average);
        }
    }

    public static double findAverage(int a, int b, int c) {
        double average = (a + b + c) / 3;
        return average;
    }
}
