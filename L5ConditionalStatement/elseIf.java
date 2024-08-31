
// import java.util.Scanner;
// public class elseIf {
//     public static void main(String[] args) {
//         Scanner input;
//         input = new Scanner(System.in);
//         System.out.print("Enter a number between 1 and 10: ");
//         int number = input.nextInt();
//         if (number >= 1 && number <= 3) {
//             System.out.println("The number is between 1 and 3.");
//         } else if (number >= 4 && number <= 6) {
//             System.out.println("The number is between 4 and 6.");
//         } else if (number >= 7 && number <= 9) {
//             System.out.println("The number is between 7 and 9.");
//         } else if (number == 10) {
//             System.out.println("The number is 10.");
//         } else {
//             System.out.println("The number is outside the range of 1 to 10.");
//             input.close();
//         }
//     }
// }




import java.util.Scanner;

public class elseIf {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person is an adult.");
        } else if (age >= 13 && age < 18) {
            System.out.println("The person is a teenager.");
        } else {
            System.out.println("The person is a child.");
        }
        input.close();
    }
}
