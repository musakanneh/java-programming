package Easy;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber());
    }

    public static int missingNumber() {
        int[] nums = {1, 2}; int sum = 0;
        int result = (nums.length * (nums.length + 1)) / 2;

        for (int num : nums) {
            sum += num;
        }
        return result - sum;
    }
}