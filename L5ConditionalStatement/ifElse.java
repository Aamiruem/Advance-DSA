// package Advance-DSA.L5ConditionalStatement;

public class ifElse {
    public static void main(String[] args) {
        int age = 17;
        
        if (age >= 18) {
            System.out.println("You are adult and eligible to vote, drive.");

            if (age > 13 && age < 18) {
                System.out.println("You are teenager and not eligible to drive.");
            }
        } else {
            System.out.println("You are not adult enough to vote or drive.");
        }
    }
}
