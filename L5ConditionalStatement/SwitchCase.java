
// import java.util.Scanner;
// public class SwitchCase {

//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number between 1 and 3: ");
//         int n = sc.nextInt();
//         switch (n) {
//             case 1 -> System.out.println("Samosa");
//             case 2 -> System.out.println("Burger");
//             case 3 -> System.out.println("MangoShake");
//             default -> System.out.println("Default case");
//         }
//     }
// }





import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character between 'a' and 'c': ");
            char ch = sc.next().charAt(0); // Corrected: Use next() and charAt(0) to get a character
            switch (ch) {
                case 'a': // Corrected: Use single quotes for character literals
                    System.out.println("Samosa");
                    break;
                case 'b' :
                    System.out.println("Burger");
                    break;
                case 'c' :
                    System.out.println("MangoShake");
                    break;
                default :
                    System.out.println("Default case");
            }
        }
    }
}








// 1. Switch case is used to perform different actions based on different conditions.
// 2. In the given code, a Scanner object is created to read user input.
// 3. The user is prompted to enter a number between 1 and 3.
// 4. The switch statement checks the value of the input number.
// 5. For each case, a corresponding action is executed.
// 6. If the input number is 1, the message "Samosa" is printed.
// 7. If the input number is 2, the message "Burger" is printed.
