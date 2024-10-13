// package Practice1;

// import java.util.Scanner;
// public class checkPositive {
//     public static void main(String[] args) {
//         Scanner input;
//         input = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int number = input.nextInt();
//         if (number == 0) {
//             System.out.println("The number is zero");
//         }
//         else if (number > 0) {
//             System.out.println("The number is positive");
//         } else {
//             System.out.println("The number is negative");
//         }
//         input.close();
//     }
// }
import java.util.Scanner;

public class checkPositive {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = input.nextInt();

        //Condition:
        // x > 0 is the condition being checked.
        // True case: If x > 0 is true (i.e., if x is greater than 0), then y is assigned the value 1.
        // False case: If x > 0 is false (i.e., if x is less than or equal to 0), then y is assigned the value -1.
        int y = (x > 0) ? 1 : -1;
        //or

        // int y;
        // if (x > 0) {
        //     y = 1;
        // } else {
        //     y = -1;
        // }


        if (x == 0) {
            y = 0;
        }
        // switch (y) {
        //     case 0:
        //         System.out.println("The number is Zero");
        //         break;
        //     case 1:
        //         System.out.println("The number is positive");
        //         break;

        //     case -1:
        //         System.out.println("The number is negative");
        //         break;
        // }
        //or both same above and below
        switch (y) {
            case 0 ->
                System.out.println("The number is Zero");
            case 1 ->
                System.out.println("The number is positive");

            case -1 ->
                System.out.println("The number is negative");
        }
        input.close();
    }
}
