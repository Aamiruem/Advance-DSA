package L8Function;

import java.util.Scanner;
public class PrimeNumbers {
    public static boolean isPrime(int n) {
        // only corner case
        //for n>= 2
        if (n == 2) {
            return true;
        }
        // or cases
        boolean isprime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { //completely dividing 
                isprime = false;
                break;
            }
        }

        return isprime;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(7)); //function call
        
        //this is the user input
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = input.nextInt();

            if (isPrime(n)) { //function call
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
