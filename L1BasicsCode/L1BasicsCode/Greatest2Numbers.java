package L1BasicsCode;

import java.util.Scanner;
public class Greatest2Numbers {
    public static void main(String[] args) {

        try (// int a = 30;
                // int b = 20;
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();

            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println(a + " is greater than " + b);
            } else {
                System.out.println(b + " is greater than " + a);
            }
        }
    }
}
