package L2VariableAndDataTypes;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        // System.out.println("Enter your full name : ");
        // String s = input.next(); //not print in the next line 
        // System.out.println(s);


        // System.out.println("Enter your name: ");
        // String name = input.nextLine(); //withe print next line
        // System.out.println("Hello " + name);

        //byte
        // System.out.println("Enter your number: ");
        // byte number = input.nextByte();
        // System.out.println("Your number is: " + number);

        //short
        System.out.println("Enter your number: ");
        short number = input.nextShort();
        System.out.println("Your number is: " + number);


        //int
        // System.out.println("Enter your age: ");
        // int age = input.nextInt();
        // System.out.println("Your age is: " + age);

        //float
        // System.out.println("Enter your salary: ");
        // float salary = input.nextFloat();
        // System.out.println("Your salary is: " + salary);


        //boolean
        // System.out.println("Enter your boolean value: ");
        // boolean bool = input.nextBoolean();
        // System.out.println("Your boolean value is: " + bool);

        //char
        // System.out.println("Enter your character value: ");
        // char ch = input.next().charAt(0);
        // System.out.println("Your character value is: " + ch);

        // long
        // System.out.println("Enter your long value: ");
        // long l = input.nextLong();
        // System.out.println("Your long value is: " + l);

        // double
        System.out.println("Enter your double value: ");
        double d = input.nextDouble();
        System.out.println("Your double value is: " + d);
        input.close();
    }
}
