package L8Function;

public class sumOfFunction {

    //function to calculate sum of 2 nums
    public static int sum(int a, int b) {
        return a + b;
    }
//function to calculate sum of 2 nums

public static int sum(int a, int b, int c) {
    return a + b + c;
}
//function to calculate add some float numbers
public static float sum(float a, float b) {
    return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20));

        System.out.println(sum(10, 20, 30));

        System.out.println(sum(10.5f, 20.5f));
    }
}
