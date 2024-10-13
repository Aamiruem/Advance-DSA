package L2VariableAndDataTypes;
public class TypeCastings {
    public static void main(String[] args) {


        // Implicit type casting
        int num1 = 10;
        double num2 = 10.5;
        double result = num1 + num2; // Implicit type casting, int ko double me convert karne ka kosish kar raha hai
        System.out.println("Implicit type casting: " + result);

        // Explicit type casting
        double d = 10.5;
        int i = (int) d; // Explicit type casting d ko int me convert karne ka kosish kar raha hai
        System.out.println("double to int " + i);


        int a = 10;
        float m = (float)a;
        System.out.println("int to float " + m);
        float b = 20.5f;
        int c = (int) b; // Explicit type casting b ko int me change karne ka kosish kar raha hai
        System.out.println("float to int " + c);

        int marks = 99;
        char grade = (char) marks;
        System.out.println("int to char " + grade);

        float f = 10.5f;
        long l = (long) f;
        System.out.println("float to long " + l);



    }
}
