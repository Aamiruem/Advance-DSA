package L2VariableAndDataTypes;
// package Advance-DSA.L2VariableAndDataTypes;

import java.util.Scanner;
public class SquareArea1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the side length of the square: ");
            double sideLength = sc.nextDouble();
            
            double area = sideLength * sideLength;
            
            System.out.printf("The area of the square is %.2f square units.%n", area);
            
            sc.close();
        }
        
        System.out.println("Program completed successfully.");
    }
}
