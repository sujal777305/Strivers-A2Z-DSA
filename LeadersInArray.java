import java.util.*;

public class LeadersInArray {
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;
        int maxFromRight = nums[n - 1];
        leaders.add(maxFromRight);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 3, 1, 2};
        System.out.println(findLeaders(nums1));
        int[] nums2 = {-3, 4, 5, 1, -4, -5};
        System.out.println(findLeaders(nums2));
    }
}
