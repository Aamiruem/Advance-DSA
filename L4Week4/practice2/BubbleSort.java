// public class BubbleSort {

//     public static void main(String[] args) {
//         int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         int n = 10;
//         for(int i = 0; i <n; i++){
//             for(int index = 0; index<n-1; index++){
//                 if(arr[index] > arr[index+1]){
//                     int temp = arr[index];
//                     arr[index] = arr[index+1];
//                     arr[index+1] = temp;
//                 }
//             }
//         }

//         System.out.print("Sorted array ascending order: ");
//         for(int i = 0; i <n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }






public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = 10;
        for(int i = 0; i <n; i++){
            for(int index = 0; index<n-1; index++){
                if(arr[index] < arr[index+1]){
                    int temp = arr[index+1];
                    arr[index+1] = arr[index];
                    arr[index] = temp;
                }
            }
        }

        System.out.print("Sorted array descending order: ");
        for(int i = 0; i <n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}