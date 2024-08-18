package L1BasicsCode;

import java.util.Scanner;
public class Fahrenheit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + f);
        sc.close();
    }
}








// import java.util.Scanner;

// public class Fahrenheit {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the temperature in Fahrenheit: ");
//         double f = sc.nextDouble();
//         double c = (f - 32) * 5/9;
//         System.out.println("The temperature in Celsius is: " + c);
//         sc.close();
//     }
// }
