package Easy.String.TwoPointers.Easy;

import java.util.ArrayList;

/***
 * Given an integer array nums, move all the even integers at the
 * beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 * https://leetcode.com/problems/sort-array-by-parity/
 */

public class SortArrayByParity {
    public static void main(String[] args) {
        System.out.println(sortArrayByParity());
    }

    static int[] sortArrayByParity() {
        int[] nums = {3, 1, 2, 4};
        int even_number = 0, odd_number = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even_number = nums[i];
                nums[i] = nums[odd_number];
                nums[odd_number] = even_number;
                odd_number++;
            }
        }

        return nums;
    }

    static int[] sortArrayByParity2() {
        int[] nums = {3, 1, 2, 4};
        if(nums.length <= 1) return  nums;
        ArrayList<Integer> sorted_array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sorted_array.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) sorted_array.add(nums[i]);
        }
        int [] result = new int[nums.length];

        for (int i = 0; i < sorted_array.size(); i++) {
            result[i] = sorted_array.get(i);
        }

        return result;
    }
}
