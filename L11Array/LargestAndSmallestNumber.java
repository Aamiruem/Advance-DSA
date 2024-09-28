package L11Array;

public class LargestAndSmallestNumber {
    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 13, 24 };
        int index = largest(numbers);
        System.out.println("The largest number is: " + index);
    }
}
