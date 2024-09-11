package L1BasicsCode;

import java.util.Scanner;
public class AreaCircles{
    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = input.nextDouble();
        double pi = 3.14;
        double area;
        area = pi * radius * radius;
        System.out.println("The area of the circle is: " + area);

        input.close();
    }
}
