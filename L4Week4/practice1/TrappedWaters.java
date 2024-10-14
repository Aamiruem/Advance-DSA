
// package L4Week4.practice1;

// public class TrappedWaters {
//     public static int findWater(int arr[]) {

//         // n = arr-size
//         int n = arr.length;

//         // Arrays to store the maximum water level from the left and right
//         int left[] = new int[n];
//         int right[] = new int[n];

//         // precompute the left array max
//         left[0] = arr[0];
//         for (int i = 1; i < n; i++) {
//             left[i] = Math.max(left[i - 1], arr[i]);
//         }

//         // precompute the right array max
//         right[n - 1] = arr[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             right[i] = Math.max(right[i + 1], arr[i]);
//         }

//         // Calculate accumulated water
//         int totalWater = 0;
//         System.out.println("water ->");
//         for (int i = 0; i < n; i++) {
//             int water = Math.min(left[i], right[i]) - arr[i];
//             totalWater += water;
//             System.out.print(water + ", ");
//         }
//         System.out.println();
//         return totalWater;
//     }

//     public static void main(String[] args) {

//         int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

//         // Print input array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + ", ");
//         }
//         System.out.println("");

//         // Find and print the total trapped water
//         int ans = findWater(arr);

//         System.out.println("Total water = " + ans);

//     }
// }




package L4Week4.practice1;

public class TrappedWaters {
    public static int findWater(int arr[]) {

        // n = arr-size
        int n = arr.length;

        // Arrays to store the maximum water level from the left and right
        int left[] = new int[n];
        int right[] = new int[n];
        int water[] = new int[n]; // To store water at each index

        // precompute the left array max
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        // precompute the right array max
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        // Calculate accumulated water
        int totalWater = 0;
        System.out.println("Index\tLeft\tRight\tHeight\tWater");
        for (int i = 0; i < n; i++) {
            water[i] = Math.min(left[i], right[i]) - arr[i];
            totalWater += water[i];
            // Printing left, right, height, and water at each index
            System.out.println(i + "\t--> " + left[i] + "\t--> " + right[i] + "\t--> " + arr[i] + "\t--> " + water[i]);
        }

        return totalWater;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        // Print input array
        System.out.print("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");

        // Find and print the total trapped water
        int ans = findWater(arr);

        System.out.println("Total water = " + ans);
    }
}
