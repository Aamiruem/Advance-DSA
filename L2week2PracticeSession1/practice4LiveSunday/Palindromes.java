package L1BasicsCode.L2week2PracticeSession1.practice4LiveSunday;


import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int st = 1;
        int sp = n - 1;
        int number_of_line = 1;
        while (number_of_line <= n) {

            // print space
            for (int i = 0; i < sp; i++) {
                System.out.print(" ");
            }

            // print stars
            int curr_number = number_of_line;
            for (int i = 0; i < st; i++) {
                System.out.print(curr_number + "");
                if (i < st / 2) {
                    curr_number--;
                } else {
                    curr_number++;
                }
            }

            //next line
            System.err.println(" ");
            st +=2;
            sp--;
            number_of_line++;
        }
        sc.close();
    }
}
