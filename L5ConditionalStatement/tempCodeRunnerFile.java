import java.util.Scanner;

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();
            // ternary operators
            String result = (x % 2 == 0) ? "even Number" : "odd number";
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
