package L3Week3Practice.practice3;

public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + i * 34;
        }
        int key = 70;
        System.out.println(linearSearch(arr, key));
    }
}
