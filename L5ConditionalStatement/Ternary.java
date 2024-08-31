import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();
            // ternary operators
            String result = (x % 2 == 0) ? x +" is even Number" : x +" is odd number";
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
