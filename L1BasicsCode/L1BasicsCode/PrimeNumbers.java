// package L1BasicsCode;

// public class PrimeNumbers {
//     public static void main(String[] args) {
//         int n = 10;
//         for (int i = 2; i < n; i++) {
//             boolean isPrime = true;
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.println(i);
//             }
//         }
//     }
// }




package L1BasicsCode;
public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 100; // Define the limit up to which you want to find prime numbers

        System.out.println("Prime numbers up to " + limit + " are:");

        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

