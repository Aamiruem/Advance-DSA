// public class SelectionSort {
//     public static void main(String[] args) {
//         int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         int n = 10;
//             for(int index = 0; index<n; index++){
//                 int max_elem = arr[index];
//                 int max_index = index;
//                 for(int i = index+1; i<n; i++){
//                     if(arr[i] < max_elem){
//                         max_elem = arr[i];
//                         max_index = i;
//                     }
//                 }
//                 int temp = arr[index];
//                 arr[index] = arr[max_index];
//                 arr[max_index] = temp;
//             }

//         System.out.print("Sorted array ascending order: ");
//         for(int i = 0; i <n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }





public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = 10;
            for(int index = 0; index<n; index++){
                int max_elem = arr[index];
                int max_index = index;
                for(int i = index+1; i<n; i++){
                    if(arr[i] > max_elem){
                        max_elem = arr[i];
                        max_index = i;
                    }
                }
                int temp = arr[index];
                arr[index] = arr[max_index];
                arr[max_index] = temp;
            }

        System.out.print("Sorted array descending order: ");
        for(int i = 0; i <n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
