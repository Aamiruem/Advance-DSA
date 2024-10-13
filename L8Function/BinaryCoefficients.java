package L8Function;


public class BinaryCoefficients {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoef(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoef = fact_n / (fact_r * fact_nmr);

        return binCoef;
    }
    public static void main(String[] args) {

        int n = 5;
        int r = 2;

        System.out.println(binCoef(n, r));
    }
}
