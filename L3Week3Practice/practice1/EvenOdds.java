// package L3Week3Practice.practice1;

import java.util.Scanner;
public class EvenOdds {
    public static boolean isEven(int x) {
        return x % 2 == 0;

    }
    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println(num + " is neither even nor odd this is a zero");
        } 
        else if (isEven(num)) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }


        if (isEven(6)) { //test case for 6 to be even
            System.out.println("function is working fine!");
        }
        else {
            System.out.println("there is some error in a function ");
        }


        if (isEven(21)) { //test case for 21 to be odd
            System.out.println("there is some error in a function ");
        } else {
            System.out.println("function is working fine!");
        }
        input.close();
    }
}
