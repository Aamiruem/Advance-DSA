
import java.util.Scanner;

// package practice4LiveSunday;
public class HollowRhombus {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        int osp = n - 1;
        int isp = n - 2;
        int number_of_line = 1;
        while (number_of_line < n) {
            // print space
            if (number_of_line == 1 || number_of_line == n) {
                for (int i = 0; i <= osp; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < n; i++) {
                    System.out.print("* ");
                }
            } else {
                //print outer space
                for (int i = 0; i <= osp; i++) {
                    System.out.print(" ");
                }
                //print star
                System.out.print("* ");
            }
            // print inner space
            for (int i = 0; i < isp; i++) {
                System.out.print("  ");
            }
            //print star
            System.err.println("*");

        }
        //next line
        System.err.println();
        osp--;
        number_of_line++;

        sc.close();
    }
}
