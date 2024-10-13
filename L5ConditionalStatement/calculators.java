

// import java.util.Scanner;

// public class calculators {

//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double a = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double b = sc.nextDouble();

//         System.out.print("Enter operator: ");
//         char operator = sc.next().charAt(0);

//         switch (operator) {
//             case '+':
//                 System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
//                 break;
//             case '-':
//                 System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
//                 break;
//             case '*':
//                 System.out.printf("%.2f * %.2f = %.2f%n", a, b, a * b);
//                 break;
//             case '/':
//                 if (b == 0) {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 } else {
//                     System.out.printf("%.2f / %.2f = %.2f%n", a, b, a / b);
//                 }
//                 break;
//             case '%':
//                 if (b == 0) {
//                     System.out.println("Error: Modulo by zero is not allowed.");
//                 } else {
//                     System.out.printf("%.2f mod %.2f = %.2f%n", a, b, a % b);
//                 }
//                 break; // Added break here
//             default:
//                 System.out.println("Error: Invalid operator. Please use +, -, *, / or %.");
//         }
//     }
// }













import java.util.Scanner;

public class calculators {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
            case '-' -> System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
            case '*' -> System.out.printf("%.2f * %.2f = %.2f%n", a, b, a * b);
            case '/' -> {
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, a / b);
                }
            }
            case '%' -> {
                if (b == 0) {
                    System.out.println("Error: Modulo by zero is not allowed.");
                } else {
                    System.out.printf("%.2f mod %.2f = %.2f%n", a, b, a % b);
                }
                // Added break here
            }
            default -> System.out.println("Error: Invalid operator. Please use +, -, *, / or %.");
        }
    }
}
