package L2VariableAndDataTypes;
import java.util.Scanner;
public class AverageSum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number of integers: ");
        float A = sc.nextFloat();
        
        System.out.println("Enter the second number of integers: ");
        float B = sc.nextFloat();
        
        System.out.println("Enter the third number of integers: ");
        float C = sc.nextFloat();
        
        // int average = (A + B +C)(float)/3;
        
        float sum = A + B + C;

        float Average = sum/3;
        
        System.out.println("Average of the three numbers: = " + Average);

    }
}
