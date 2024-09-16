// package L3Week3Practice.practice1;

import java.util.Scanner;
public class DigitInIntegers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int sum = 0;
            while (num != 0) {
                sum += (num % 10);
                num = num / 10;

            }
            System.out.println(sum);
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
    
}
