package L8Function;

public class callByValues {

    public static void swap(int a, int b) {
        System.out.println("Before swapping a = " + a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a + " and b = " + b);
        //only change in swap function call by value 
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b); // copy of a and b make a main function like psvm main is called callByValues
        //function calling
    }
}

// call by value=>  only copy return karta hai
// call by reference => original value return karta hai
