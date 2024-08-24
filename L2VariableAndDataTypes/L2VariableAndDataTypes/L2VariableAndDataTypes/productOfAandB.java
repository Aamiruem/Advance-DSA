import java.util.Scanner;

public class productOfAandB {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        int product = a * b;

        System.out.println("Product of A and B is: " + product);

        input.close();
    }
}
