// package Advance-DSA.L2week2PracticeSession1.Practice1;


import java.util.Scanner;
public class Fever {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = input.nextDouble();
        if (temp > 100) {
            System.out.println("you have Fever");
        }
        else {
            System.out.println("you don't have Fever");
        }
        input.close();
    }
}
