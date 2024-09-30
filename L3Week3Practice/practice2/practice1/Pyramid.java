package L1BasicsCode.L1BasicsCode.L3Week3Practice.practice2.practice1;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int num = input.nextInt();

            for (int line = 1; line <= num; line++) {
                // for space
                for (int j = 0; j <= num - line; j++) {
                    System.out.print(" ");
                }
                // for num
                for (int j = 0; j <= 2 * line - 1; j++) {
                    if (j % 2 == 0) {
                        System.out.print(line);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
