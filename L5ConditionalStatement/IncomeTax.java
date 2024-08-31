

import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = input.nextInt();
        int tax;
        
        if (income <= 500000) {
            tax = 0;
        } else if (income <= 1000000) {
            // tax = (income - 500000) * 20 / 100;
            tax = (int) (income * 0.2);
        } else {
            // tax = (income - 1000000) * 30 / 100;
            tax = (int) (income * 0.3);
        }

        System.out.println("your Tax is : " + tax);
        input.close();

    }
}
