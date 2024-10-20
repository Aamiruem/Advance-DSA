import java.util.Arrays;

public class CountingSorts {
    public static void countingSort(int[] arr) {
        // Find the maximum value in the array
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);

        // Create a count array to store the frequency of each element
        int[] count = new int[max + 1];

        // Count the occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
