public class reverseMethods {

    public static void main(String[] args) {
        int number = 108995;

        int rev = 0;
        while (number > 0) {
            int lastDigit = number % 10;

            rev = (rev * 10) + lastDigit;
            number = number / 10; // number /= 10; for remove from the last number
        }
        System.out.println(rev + "  ");
    }

}
