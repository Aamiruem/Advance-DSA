
// package L8Function;

// public class BlockScopes {

//     // Method defined at the class level
//     public static void blockScope(int n) {
//         for (int i = 0; i < n; i++) {
//             System.out.println(i);  // i is accessible inside the loop
//         }
//     }

//     public static void main(String[] args) {
//         blockScope(5);  // Calling the method inside main

//         // i is not defined here because it has block scope inside the for loop
//         // Uncommenting the line below will result in an error:
//         // System.out.println(i); // Error: i is not accessible here
//     }
// }







package L8Function;  // Defines the package for the class.

public class BlockScopes {  // Defines the class "BlockScopes".

    // Method defined at the class level
    public static void blockScope(int n) {  // Declares a static method blockScope that takes an integer 'n' as a parameter.
        // The variable 'i' is declared inside the 'for' loop, so it is only accessible within the loop block.
        for (int i = 0; i < n; i++) {  // 'i' is initialized and used within this for loop.
            System.out.println(i);  // Prints the value of 'i' within the loop. 'i' is accessible here.
        }  // The block (scope) for 'i' ends here. 'i' is no longer accessible after the loop.
    }

    public static void main(String[] args) {  // The main method is the entry point of the program.
        blockScope(5);  // Calls the blockScope method with the argument 5. The loop in blockScope will print 0 to 4.

        // 'i' is not defined here because it was declared inside the for loop in the blockScope method.
        // Trying to access 'i' here would result in a compile-time error:
        // System.out.println(i);  // Uncommenting this line will cause an error because 'i' is out of scope.
    }
}
