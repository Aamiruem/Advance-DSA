// package L6Loops;

public class Breaks {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Inside loop: " + i);
        }
        System.err.println("I am out of the loops ");
    }
}
