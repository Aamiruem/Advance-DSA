public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = 10;
        int max_elem = 0;
        for(int i = 0; i <n; i++){
            if(arr[i]>max_elem){
                max_elem = arr[i];
            }
        }
        //freq = count
        int[] freq = new int[max_elem + 1];
        for(int i = 0; i < n; i++){
            freq[arr[i]] +=1;
        }
        //cumulative freq = prefix sum
        for(int i = max_elem; i>=0;  i--){
            while(freq[i]>0){
                System.out.print(i);
                System.out.print(" ");
                //freq[i]--; 
                freq[i] -=1;
            }
        }
    }
}




// public class CountingSort {
//     public static void main(String[] args) {
//         int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         int n = arr.length;

//         // Find the maximum element in the array
//         int max_elem = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max_elem) {
//                 max_elem = arr[i];
//             }
//         }

//         // Create the frequency array
//         int[] freq = new int[max_elem + 1];
//         for (int i = 0; i < n; i++) {  // Fixed iteration condition to i < n
//             freq[arr[i]] += 1;
//         }

//         // Print sorted elements in descending order (if required)
//         for (int i = max_elem; i >= 0; i--) {  // Print from largest to smallest
//             while (freq[i] > 0) {
//                 System.out.print(" " + i);
//                 freq[i]--;
//             }
//         }
//     }
// }
