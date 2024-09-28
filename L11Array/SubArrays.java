package L11Array;

public class SubArrays {
    public static void printSubArrays(int[] numbers) {
        int ts = 0;
        int n = numbers.length;
        for(int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                // System.out.print("Subarray from " + start + " to " + end + ": ");
                for (int k = start; k <= end; k++) { // printing subarray
                    System.out.print(numbers[k] + " "); //SubArray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("Total subArrays with sum " + ": " + ts);
        System.out.println("Total subArrays: " + ts); // Using formula to calculate total subArrays in one pass.  // formula for total subArrays = n * (n + 1) / 2, where n is the length of the array.  // This formula is used in the given code.  // However, for the given array, the code has a time complexity of O(n^3) and space complexity of O(1).  // This is why we need to convert the length to something
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
        System.out.println("Total subArrays: " + (numbers.length * (numbers.length + 1)) / 2); // formula for total subArrays
    }
}
