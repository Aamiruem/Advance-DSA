package L11Array;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 10, 30, 45, 67, 74, 83, 98, 154, 217, 265 };
        int key = 265;
        System.out.println("index for key " + key + " is " + binarySearch(numbers, key));
    }
}
