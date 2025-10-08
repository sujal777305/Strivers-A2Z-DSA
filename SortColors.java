import java.util.*;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 0, 2, 1, 0};
        sortColors(nums1);
        System.out.println("Output 1: " + Arrays.toString(nums1)); // [0, 0, 1, 1, 2]

        int[] nums2 = {0, 0, 1, 1, 1};
        sortColors(nums2);
        System.out.println("Output 2: " + Arrays.toString(nums2)); // [0, 0, 1, 1, 1]
    }
}
