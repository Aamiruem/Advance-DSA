// package leftShift;

public class LeftShift {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        System.out.println("a << 2: " + (a << 2));
        System.out.println("b << 2: " + (b << 2));

        System.out.println("a >> 2: " + (a >> 2));
        System.out.println("b >> 2: " + (b >> 2));

        System.out.println("a >>> 2: " + (a >>> 2));
        System.out.println("b >>> 2: " + (b >>> 2));

        System.err.println();

        int m = 10;

        // using left shift
        System.out.println("m<<1 : " + (m<< 1));

        // using right shift System
        System.out.println("m>>1 : " + (m >> 1));

    }

}
