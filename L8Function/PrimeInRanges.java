package L8Function;

public class PrimeInRanges {

    public static boolean isPrime(int n) {
        // if (n <= 1) {
        //     return false;
        // }
        // if (n == 2) {
        //     return true;
        // }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2 3 5 7 11 13 17 19
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInRange(20);
    }
}
