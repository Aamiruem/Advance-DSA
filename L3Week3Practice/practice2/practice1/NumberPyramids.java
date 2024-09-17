// package practice1;

import java.util.Scanner;
public class NumberPyramids {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();
            for (int line = 1; line <= rows; line++) {
                for (int j = 0; j <= 2 * line - 1; j++) {
                    if (j % 2 == 0) {
                        
                        System.out.print(line + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
