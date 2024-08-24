import java.util.Scanner;

public class SumOfAandB{

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum is A nad B is = " + sum);
        input.close();
    }
}
