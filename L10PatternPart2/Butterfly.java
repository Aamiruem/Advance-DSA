package L10PatternPart2;
public class Butterfly {
    public static void butterfly(int n) {
        // upper half
        for (int i = 1; i <= n; i++) {
            // star 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // star 2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // star 1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // star 2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(6);
    }
}
