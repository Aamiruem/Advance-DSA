package L2week2PracticeSession1.practice4LiveSunday;


public class palindromeNumber {

    public static void main(String[] args) {

        int number = 12321;

        int temp = number;

        int reverse = 0;

        while (temp > 0) {

            int rem = temp % 10;

            reverse = reverse * 10 + rem;

            temp = temp / 10;

        }

        if (number == reverse) {

            System.out.println(number + " is a palindrome number");

        } else {

            System.out.println(number + " is not a palindrome number");

        }
    }
}
