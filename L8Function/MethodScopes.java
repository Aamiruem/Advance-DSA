package L8Function;  // Defines the package name where the class is located.

public class MethodScopes {  // Defines the class "MethodScopes", a container for methods and variables.

    public static void printS() {  // Defines a static method "printS", which can be called without creating an instance of the class.

        int s = 10;  // A local variable 's' is declared inside the printS() method and initialized to 10. This variable only exists within printS().

        System.out.println("S in printS method: " + s);  // Prints the value of 's' inside the printS() method (which is 10).
    }

    public static void main(String[] args) {  // Defines the main method, the entry point of the program.

        int s = 20;  // A local variable 's' is declared inside the main() method and initialized to 20. This variable only exists within main().

        System.out.println("S in main method: " + s);  // Prints the value of 's' inside the main() method (which is 20).

        printS();  // Calls the printS() method.
    }
}
