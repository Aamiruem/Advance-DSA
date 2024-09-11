package L8Function;

import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int n) {
        boolean isprime = true;
        // only corner case
        //for n>= 2
        if (n == 2) {
            return true;
        }
        // or cases

        for (int i = 2; i <= Math.sqrt(n); i++) {
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
