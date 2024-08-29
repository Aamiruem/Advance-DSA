
public class LossyConversion {
    public static void main(String[] args) {
        // int a = 25;
        // long d = a;

        // System.out.println(a);
        // System.out.println(d);


        // long a = 2599999999999l;
        // int d = (int)a; // this is a explicit conversion

        // System.out.println("This sis a long = " + a);
        // System.out.println("This is the convert into the long to int = " + d);



        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.println("BODMAS: " + exp1);
        // System.out.println("BODMAS: " + exp2);


        // int a = 10;
        // int b = 3;
        // int c = a / b; // This is integer division, it will return 3
        // System.out.println("Integer Division: " + c);

        // // preIncrement

        // int d = 10;
        // int e = ++d; // pahle change then use or print
        // System.out.println("Increment: " + e);

        // // postDecrement

        // int f = 10;
        // int g = f--; // pahle use then print
        // System.out.println("Decrement: " + g);

        // int m = 10;
        // int n = ++m; //pahle change then use or print
        // System.out.println("Pre-Increment: " + m + "\n " + n);

        // int m1 = 10;
        // int n1 = --m1; //pahle change then use or print
        // System.out.println("Pre-Decrement: " + m1 + "\n " + n1);



        // Scanner sc;
        // sc = new Scanner(System.in);
        // System.out.print("Enter a name: ");
        // String a = sc.next();
        // System.out.println("Your name is: " + "@" + a); //this print only first word
        // sc.close();

        // System.err.println();

        // Scanner Input;
        // Input = new Scanner(System.in);

        // System.out.print("Enter a name: ");
        // String b = Input.nextLine();
        // System.out.println("Your name is: " + "@" + b);//this print all word whatever to get a input to print same as it is output

        // Input.close();

        System.err.println(1 + 1);
        System.err.println("1" + "1");//
        System.err.println(1 + "1" + 1);
        System.err.println('1' + '1'); //'1' = ASCII value = 49


        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        // long l = 7465456484654l;

        double result = (f * b) + (i % c) - (d * s);

        System.out.println(result);

        System.out.println(b + c + s + i + f + d);

        // System.out.println(l);
        


    }
}
