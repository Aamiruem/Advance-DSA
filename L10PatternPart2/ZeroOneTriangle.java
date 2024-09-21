public class ZeroOneTriangle {

    public static void zeroOneTriangle(int n) {

        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {

                if ((line + num) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        zeroOneTriangle(5);
    }
}
