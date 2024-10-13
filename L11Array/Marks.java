// package L11Array;

// public class Marks {
//     public static void update(int marks[]) {

//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[] args) {

//         int marks[] = { 98, 96, 94, 84 };
//         int nonChangable = 10;
//         update(marks, nonChangable);
//         System.out.println(nonChangable);

//         for (int i = 0; i < marks.length; i++) {
//             System.out.println(marks[i] + " ");
//         }
//         System.out.println();
//         System.out.println(marks.length);
//     }
// }






package L11Array;

public class Marks {
    // Updated method to accept both marks and nonChangable as parameters
    public static void update(int[] marks, int nonChangable) {
        // Increment each mark by 1
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

        // Increment nonChangable (won't affect the original value)
        nonChangable += 1;
    }

    public static void main(String[] args) {
        int marks[] = { 98, 96, 94, 84 };
        int nonChangable = 10;

        // Call update method with both marks and nonChangable
        update(marks, nonChangable);

        // This will print the original value of nonChangable since it won't change
        System.out.println(nonChangable); // Output will be 10

        // Print updated marks array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); // Output will be 99 97 95 85
        }
        System.out.println();

        // Print the length of marks array
        System.out.println(marks.length); // Output will be 4
    }
}
