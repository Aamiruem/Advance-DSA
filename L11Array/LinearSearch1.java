package L11Array;

public class LinearSearch1 {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 13, 24 };
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Index not found: ");
        } else {
            System.out.println("Index at found: " + index);
        }
        System.out.println();
    }
}
