public class Q4TypeConversion {
    public static void main(String[] args) {
        byte b = 5;
        char ch = 'c';
        short s = 4;
        int i = 550;
        float f = 3.14f;
        double d = 1000;
        long l = 10000l;

        System.out.println(b+ch+s+i+f+d+l);
        double result = (f * b) + (i % ch) - (d * s);

        System.out.println(result);
    }
}
