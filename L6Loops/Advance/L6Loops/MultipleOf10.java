// package L6Loops;

import java.util.Scanner;
public class MultipleOf10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            do {
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    System.out.println(num + " is a multiple of 10.");
                    break;
                } else {
                    System.out.println(num + " is not a multiple of 10.");
                }
            } while (true);
        }
        System.out.println("Program terminated.");
        
    }
}
