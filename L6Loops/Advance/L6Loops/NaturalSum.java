// package L6Loops;

// import java.util.Scanner;

// public class NaturalSum {

//     public static void main(String[] args) {
//         int sum = 0;
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("Enter the number: ");
//             int number = input.nextInt();

//             for (int i = 1; i <= number; i++) {
//                 sum = sum + i;
//             }

//             System.out.println("The sum of natural numbers up to " + number + " is: " + sum);
//         }
//         System.out.println("Done!");
//     }
// }







import java.util.Scanner;

public class NaturalSum {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int number = input.nextInt();

            while (i <= number) {
                sum = sum + i;
                i++;
            }

            System.out.println("The sum of natural numbers up to " + number + " is: " + sum);
        }
        System.out.println("Done!");
    }
}
