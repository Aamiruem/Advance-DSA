// package Advance-DSA.L2VariableAndDataTypes;

public class dataTypes {
    byte b = 4;
    char c = 'a';
    short s = 20000;
    int i = 1000000;
    float f = 10.5f;
    double d = 10.5;
    long l = 1000000000000L;
    boolean bool = true;

    double result = (f*b) + (i%c) + - (d*s) + l ;
    public static void main(String[] args) {
        System.out.println("Result: " + new dataTypes().result);
        System.out.println("Byte: " + new dataTypes().b);
        System.out.println("Character: " + new dataTypes().c);
        System.out.println("Short: " + new dataTypes().s);
        System.out.println("Integer: " + new dataTypes().i);
        System.out.println("Float: " + new dataTypes().f);
        System.out.println("Double: " + new dataTypes().d);
        System.out.println("Long: " + new dataTypes().l);
        System.out.println("Boolean: " + new dataTypes().bool);
        // Type casting
        System.out.println("Casted Integer: " + (int) new dataTypes().d);
        System.out.println("Casted Float: " + (float) new dataTypes().i);
        System.out.println("Casted Long: " + (long) new dataTypes().f);
        // System.out.println("Casted Boolean: " + (boolean) new dataTypes().l);
        // Type conversion
        System.out.println("Converted Integer to Double: " + (double) new dataTypes().b);
        System.out.println("Converted Integer to Float: " + (float) new dataTypes().i);
        System.out.println("Converted Integer to Long: " + (long) new dataTypes().s);
        // System.out.println("Converted Integer to Boolean: " + (boolean) new dataTypes().c);
        System.out.println("Converted Float to Integer: " + (int) new dataTypes().f);
        System.out.println("Converted Float to Double: " + (double) new dataTypes().c);
        System.out.println("Converted Float to Long: " + (long) new dataTypes().d);
        System.out.println("Converted Float to Boolean: " + (boolean) new dataTypes().bool);
        System.out.println("Converted Long to Integer: " + (int) new dataTypes().l);
        System.out.println("Converted Long to Float: " + (float) new dataTypes().s);
        System.out.println("Converted Long to Double: " + (double) new dataTypes().b);
        // System.out.println("Converted Long to Boolean: " + (boolean) new dataTypes().i);
        // System.out.println("Converted Boolean to Integer: " + (int) new dataTypes().bool);
        // System.out.println("Converted Boolean to Float: " + (float) new dataTypes().bool);
        System.out.println("Converted Boolean to Double: " + (double) new dataTypes().b);
        System.out.println("Converted Boolean to Long: " + (long) new dataTypes().c);
        // Type comparison
        System.out.println("Integer comparison: " + (new dataTypes().i > new dataTypes().b));
        System.out.println("Float comparison: " + (new dataTypes().f > new dataTypes().c));
        System.out.println("Long comparison: " + (new dataTypes().l > new dataTypes().s));
        // System.out.println("Boolean comparison: " + (new dataTypes().bool > new dataTypes().bool));
        // Type conversion and comparison
        System.out.println("Converted Integer to Float comparison: " + (new dataTypes().i > (float) new dataTypes().b));
        System.out.println("Converted Integer to Long comparison: " + (new dataTypes().i > (long) new dataTypes().s));
        System.out.println("Converted Float to Integer comparison: " + (new dataTypes().f > (int) new dataTypes().c));
        System.out.println("Converted Float to Long comparison: " + (new dataTypes().f > (long) new dataTypes().d));
        System.out.println("Converted Long to Integer comparison: " + (new dataTypes().l > (int) new dataTypes().s));
        System.out.println("Converted Long to Float comparison: " + (new dataTypes().l > (float) new dataTypes().c));
        // System.out.println("Converted Boolean to Integer comparison: " +
        // (new dataTypes().bool > (int) new dataTypes().bool));
        // System.out.println("Converted Boolean to Float comparison: " +
        // (new dataTypes().bool > (float) new dataTypes().bool));
        // System.out.println("Converted Boolean to Long comparison: " +
        // (new dataTypes().bool > (long) new dataTypes().bool));


    }
}
