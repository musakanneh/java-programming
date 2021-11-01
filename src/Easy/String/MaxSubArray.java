package Easy.String;

/**
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum and return its sum.
 *
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray());
    }

    public static int maxSubArray() {
        int[] nums = {5,4,-1,7,8};
        int max_sum = nums[0];
        int current_sum = max_sum;

        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}