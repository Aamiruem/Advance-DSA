package L2VariableAndDataTypes;
public class TypeConversions {
    public static void main(String[] args) {

        int a = 10;
        float b = a;
        int c = (int) b;
        int d = (byte) c;
        System.out.println("int  = " + a);
        System.out.println("int to float = " + b);
        System.out.println("float to int = " + c);
        System.out.println("int to byte = " + d);

        

    }
}

// type conversion

// int a = 10;
// float b = a;
// int c = b;
// byte d = (byte) c;
// System.out.println(a);


//byte->short->int->float->long->double
