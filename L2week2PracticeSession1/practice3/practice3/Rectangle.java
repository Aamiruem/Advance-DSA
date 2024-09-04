
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int st = n;
        int sp = n - 2;

        int number_of_line = 1;
        while (number_of_line <= n-1) {
            if (number_of_line == 1 || number_of_line == n-1) {
                // print n stars
                for (int i = 0; i < st; i++) {
                    System.out.print("* ");
                }
                System.out.println(); // move to next line
            } else {
                // print one star
                System.out.print("* ");

                // print spaces
                for (int i = 0; i < sp; i++) {
                    System.out.print("  "); // double space for alignment
                }

                // print one star
                System.out.println("* ");
            }
            // move to the next line
            number_of_line++;
        }

        sc.close();
    }
}
