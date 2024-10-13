// import java.util.Scanner;

// public class Mathematics {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.print("Enter the first number: ");
//             double x = input.nextDouble();
//             System.out.print("Enter the second number: ");
//             double y = input.nextDouble();

//             System.out.println("Minimum Number of : " + x + " and " + y + " is " + Math.min(x, y));
//             System.out.println("Maximum Number of : " + x + " and " + y + " is " + Math.max(x, y));
//             System.out.println("Square Root of " + x + " is: " + Math.sqrt(x));
//             System.out.println("Power of : " + x + " ^ " + y + " = " + Math.pow(x, y));
//             System.out.println("Absolute Value: " + Math.abs(x - y));
//             System.out.println("Logarithm of " + x + " base 2: " + Math.log(x) / Math.log(2));
//             System.out.println("Logarithm of " + x + " base 10: " + Math.log10(x) / Math.log(2));
//         }
//     }
// }













import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double x = input.nextDouble();
            System.out.print("Enter the second number: ");
            double y = input.nextDouble();

            System.out.println("Minimum Number of : " + x + " and " + y + " is " + Math.min(x, y));
            System.out.println("Maximum Number of : " + x + " and " + y + " is " + Math.max(x, y));
            System.out.println("Square Root of " + x + " is: " + Math.sqrt(x));
            System.out.println("Power of : " + x + " ^ " + y + " = " + Math.pow(x, y));

            // Calculate average manually
            double average = (x + y) / 2;
            System.out.println("Average of " + x + " and " + y + " is: " + average);

            System.out.println("Absolute Value: " + Math.abs(x - y));

            // Correct logarithm calculations
            if (x > 0) {
                System.out.println("Logarithm of " + x + " base 2: " + Math.log(x) / Math.log(2));
                System.out.println("Logarithm of " + x + " base 10: " + Math.log10(x));
            } else {
                System.out.println("Logarithm calculation requires a positive number.");
            }
        }
    }
}
