// package L2week2PracticeSession1;

import java.util.Scanner;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc; 
        sc = new Scanner(System.in);
        
        System.out.print("Enter the number of butterflies: ");
        // numButterflies = n
        int n = sc.nextInt();
        int st = 1;
        int sp = 2 * n - 2;
        int number_of_line = 1;
        while (number_of_line <= n) {
            // print star
            for (int i = 1; i <= st; i++) {
                System.out.print("*");
            }

            // print space
            for (int i = 1; i <= sp; i++) {
                System.out.print(" ");
            }

            // print star
            for (int i = 1; i <= st; i++) {
                System.out.print("*");
            }

            // new line after each line
            System.out.println();
            st++;
            sp -= 2; //sp = sp-2;
            number_of_line++;
        }

        st = n;
        sp = 0;
        number_of_line = 1;
        while (number_of_line <= n) {
            // print star
            for (int i = 1; i <= st; i++) {
                System.out.print("*");
            }

            // print space
            for (int i = 1; i <= sp; i++) {
                System.out.print(" ");
            }

            // print star
            for (int i = 1; i <= st; i++) {
                System.out.print("*");
            }

            // new line after each line
            System.out.println();
            st--;
            sp += 2; //sp = sp+2;
            number_of_line++;
        }

        sc.close();
    }
}
