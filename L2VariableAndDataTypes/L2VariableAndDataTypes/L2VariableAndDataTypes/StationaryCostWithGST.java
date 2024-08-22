// package Advance-DSA.L2VariableAndDataTypes

import java.util.Scanner;
public class StationaryCostWithGST {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Inputting cost of stationary items
        System.err.println("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();
        
        System.err.println("Enter the cost of pen: ");
        float pen = sc.nextFloat();

        System.err.println("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();

        float totalCost = pencil + pen + eraser;
        System.out.println("Total Bill is = " + totalCost);

        // float gst = totalCost + (totalCost * 18) / 100; 
        // System.out.println("GST = " + gst);

        float newTotal = totalCost + (0.18f * totalCost);

        System.out.println("Total Bill with GST = " + newTotal);

    }
}









// import java.util.Scanner;
// public class StationaryCostWithGST {
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc = new Scanner(System.in);
        
//         // Inputting cost of stationary items
//         System.err.println("Enter the cost of pencil: ");
//         float pencil = sc.nextFloat();
        
//         System.err.println("Enter the cost of pen: ");
//         float pen = sc.nextFloat();

//         System.err.println("Enter the cost of eraser: ");
//         float eraser = sc.nextFloat();

//         float totalCost = pencil + pen + eraser;
//         System.out.println("Total Bill is = " + totalCost);

//         // Calculating GST
//         float gst = (totalCost * 18) / 100; 
//         System.out.println("GST = " + gst);

//         float newTotal = totalCost + gst;

//         System.out.println("Total Bill with GST = " + newTotal);
//     }
// }
