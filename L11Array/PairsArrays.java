package L11Array;

public class PairsArrays {
    public static void pairArray(int numbers[]) {
        int n = numbers.length;
        int tp = 0;
        for (int i = 0; i < n - 1; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + curr + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of unique pairs: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairArray(numbers);
        System.out.println();
        int numbers2[] = { -2, -4, -6, -8, -10 };
        pairArray(numbers2);
    }
}
