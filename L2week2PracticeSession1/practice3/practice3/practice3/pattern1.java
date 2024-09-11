package practice3;


// import java.util.Scanner;
// public class pattern1 {

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.err.println("enter number ");
//             int n = sc.nextInt();
//             int st = 1;
//             int sp = n - 1;

//             for (int i = 1; i <= n; i++) {
//                 //print star
//                 for (int j = 1; j <= st; j++) {
//                     System.out.print("* ");
//                 }

//                 //print space
//                 for (int j = 1; j <= sp; j++) {
//                     System.out.print(" ");
//                 }

//                 st++;
//                 sp--;
//                 System.out.println("\n");
//             }
//         }
//         catch (Exception e) {
//             System.err.println("Error: " + e.getMessage());
//         }

//     }
// }





import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("enter number ");
            int n = sc.nextInt();
            int st = 1;
            int sp = n - 1;
            int number_of_line = 1;

            while(number_of_line<=n) {
                //print star
                for (int j = 1; j <= st; j++) {
                    System.out.print("* ");
                }

                //print space
                for (int j = 1; j <= sp; j++) {
                    System.out.print(" ");
                }

                st++;
                sp--;

                number_of_line++;
                System.out.println("\n");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
