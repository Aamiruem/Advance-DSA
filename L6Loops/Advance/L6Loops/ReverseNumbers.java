// package L6Loops;

public class ReverseNumbers {
    public static void main(String[] args) {
        int number = 108995;

        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit + " ");
            number = number / 10; // number /= 10; for remove from the last number
        }
        System.out.println();
    }
}
