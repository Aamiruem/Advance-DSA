// package L11Array;

// public class Swaps {
//     public static void swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;
//     }
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         swap(a, b);
//         System.out.println(a + " " + b);
//     }
// }







package L11Array;

public class Swaps {
    public static void swap(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println("Before swapping " );

        System.out.println( "A = " + arr[0]);
        System.out.println("B = " + arr[1]);

        swap(arr);
        System.out.println("After swapping ");
        System.out.println("A = " + arr[0]);
        System.out.println("B = " + arr[1]);
    }
}
