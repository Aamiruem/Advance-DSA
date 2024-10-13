package L2VariableAndDataTypes;
import java.util.Scanner;

public class InputFromTheUser {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = sc.nextLine();

        System.out.println("Hello " + name);
        System.out.println("How are you " + name);
        System.out.println("I hope you will be very well " + name);


        System.out.println("Enter your age: ");

        int age = sc.nextInt();

        System.out.println("Your age is: " + age);
        System.out.println("You will be " + (age + 1) + " in next year");

        System.out.println(" i want to give you one suggestion now your time to do hard work if you want take a good job in MN'CS Company's");

    }
}
