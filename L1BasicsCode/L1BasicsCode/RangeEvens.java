package L1BasicsCode;

public class RangeEvens {
    public static void main(String[] args) {

        System.out.println("Range of even numbers from 10 to 100:");
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
