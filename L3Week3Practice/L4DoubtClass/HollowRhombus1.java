package L3Week3Practice.L4DoubtClass;

public class HollowRhombus1 {
    public static void main(String[] args) {
        int n = 6;
        int space = n - 1;
        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp <= space; sp++) {
                System.out.print("-");
            }
            space--;

            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
