// package Advance-DSA.L2week2PracticeSession1.Practice1;


import java.util.Scanner;
public class FeverCheckTernary {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = input.nextDouble();

        //ternary operator

        // System.out.println(temp > 100 ? "you have Fever" : "you don't have Fever");
        String fever = (temp > 100) ? "you have Fever" : "you don't have fever";  
        System.out.println(fever);
        input.close();
    }
}
