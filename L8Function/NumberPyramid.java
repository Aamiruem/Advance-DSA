package L8Function;

import java.util.Scanner;
public class NumberPyramid {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        int st = 1;
        int sp = n - 1;

        int number_of_line = 1;
        while (number_of_line <= n) {

            //print space
            for (int i = 0; i < sp; i++) {
                System.out.print(" ");
            }

            // print stars
            for (int i = 0; i < st; i++) {
                System.out.print(number_of_line + " ");
            }

            // next line
            System.err.println();
            sp--;
            st++;
            number_of_line++;
        }

        sc.close();
    }
}
