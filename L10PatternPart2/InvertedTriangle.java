


public class InvertedTriangle {
    public static void invertedTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedTriangle(5);
    }
}
