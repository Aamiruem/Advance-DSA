package L1BasicsCode;
import java.util.Scanner;
public class FindMaxNumbers {
    public static void main(String[] args) {

        // int a = 10;
        // int b = 20;
        // int c = 30;
        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }
        // System.out.println("The max number is " + max);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The max number is " + max);
    }
}
