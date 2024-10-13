
import java.util.Scanner;
public class Maths {

    public static void main(String[] args) {
        try (// declare and initialize two numbers  x and y
                Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double x = input.nextDouble();
            System.out.print("Enter the second number: ");
            double y = input.nextDouble();

            // double x = 28;
            // double y = 4;

            // return the maximum of two numbers  
            System.out.println("Maximum number of x and y is: " + Math.max(x, y));

            // return the square root of y   
            System.out.println("Square root of y is: " + Math.sqrt(y));


            // return the cube root of y   
            System.out.println("Cube root of y is: " + Math.cbrt(y));

            //returns 28 power of 4 i.e. 28*28*28*28    
            System.out.println("Power of x and y is: " + Math.pow(x, y));
            

            // return the logarithm of given value       
            System.out.println("Logarithm of x is: " + Math.log(x));
            System.out.println("Logarithm of y is: " + Math.log(y));

            // return the logarithm of given value when base is 10      
            System.out.println("log10 of x is: " + Math.log10(x));
            System.out.println("log10 of y is: " + Math.log10(y));

            // return the log of x + 1  
            System.out.println("log1p of x is: " + Math.log1p(x));

            // return a power of 2    
            System.out.println("exp of a is: " + Math.exp(x));

            // return (a power of 2)-1  
            System.out.println("expm1 of a is: " + Math.expm1(x));
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
