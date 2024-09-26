
package L11Array;

public class ArrayCreating {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //2nd way

        int arr1[] = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //3rd way
        int moreArr2[] = { 5, 5, 6, 7, 8, 9, 3, 2 };
        for (int i = 0; i < moreArr2.length; i++) {
            System.out.println(moreArr2[i]);
        }
        String fruits[] = new String[5];
        fruits[0] = "Apple";
        fruits[1] = "Mango";
        fruits[2] = "Banana";
        fruits[3] = "Orange";
        fruits[4] = "Pineapple";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //4th way
        String fruits1[] = { "Apple", "Mango", "Banana", "Orange", "Pineapple" };
        for (String fruit : fruits1) {
            System.out.println(fruit);
        }

        //5th way
        boolean status[] = new boolean[5];
        status[0] = true;
        status[1] = false;
        status[2] = true;
        status[3] = false;
        status[4] = true;
        for (int i = 0; i < status.length; i++) {
            System.out.println(status[i]);
        }
    }
}
