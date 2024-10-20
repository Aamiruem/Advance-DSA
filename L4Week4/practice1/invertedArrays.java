package L4Week4.practice1;

public class invertedArrays {
    public static int invertedSearch(int nums[], int target) {

        //min will have index of minimum element of nums
        int min = minSearch(nums);

        //find in sorted left
        if (nums[min] <= target && target <= nums[nums.length - 1]) {

            return search(nums, min, nums.length - 1, target);
        }

        //find in sorted right
        else {

            return search(nums, 0, min, target);
        }
    }
    //binary search to find target in to right boundary
    public static int search(int nums[], int left, int right, int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                return mid;

            } else if (nums[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return -1;

    }
    //smallest element in index
    public static int minSearch(int nums[]) {
        int left = 0;

        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (mid > 0 && nums[mid-1] > nums[mid]) {

                return mid;

            } else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){

                left = mid + 1;
            }

            else {
                right = mid - 1;

            }

        }

        return left;

    }
    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int pos = invertedSearch(arr, 2);
        System.out.println(pos);
    }
}
