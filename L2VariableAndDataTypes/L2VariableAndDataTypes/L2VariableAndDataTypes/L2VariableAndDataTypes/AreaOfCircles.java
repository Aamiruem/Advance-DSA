package L2VariableAndDataTypes;

import java.util.Scanner;

public class AreaOfCircles {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        int radius = input.nextInt();

        double area = 3.14 * radius * radius;

        System.out.println("Area of the circle is: " + area);

        input.close();
    }
}
