package L3Week3Practice.practice3;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 30, 45, 67, 74, 83, 98, 154, 217, 265 };
        int key = 265;
        System.out.println(binarySearch(arr, key));

    }
}
