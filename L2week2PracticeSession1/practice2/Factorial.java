
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner input;
        input = new Scanner(System.in);
        System.err.println("Enter a number positive integer ");
        int num = input.nextInt();
        //for (int i = num; i >= 1; i--) { // both are the same  
            for(int i = 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
        input.close();
    }
}
