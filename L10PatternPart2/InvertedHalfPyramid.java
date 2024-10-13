public class InvertedHalfPyramid {
    public static void halfPyramid(int n) {
        // outer loops
        for (int line = 1; line <= n; line++) {
            // inner loops
            for (int num = 1; num <= n - line + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfPyramid(7);
    }
}
