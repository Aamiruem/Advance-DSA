// package L11Array;

// public class ReverseArrays {
//     public static void reverse(int numbers[]) {
//         int first = 0;
//         int last = numbers.length - 1;

//         while (first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;
//             first++;
//             last--;
//         }

//     }
//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 13, 24 };
//         System.out.print("Original array:" );
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
// System.err.println();
//         reverse(numbers);
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }

//         System.out.println();
//     }
// }



package L11Array;

public class ReverseArrays {
    // Method to reverse the array in place
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        // Swap elements from start and end, moving towards the center
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 13, 24 };

        // Print the original array
        System.out.print("Original array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Print a new line

        // Reverse the array
        reverse(numbers);

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Print a new line
    }
}
