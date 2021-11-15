package TwoPointers.Easy;
import java.util.Arrays;

/***
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SortedSquares {
    public static void main(String[] args) {
        System.out.println(sortedSquares());
    }

    static int[] sortedSquares() {
        int[] nums = {-4, -1, 0, 3, 10};
        int [] sorted_arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int square_of_num = nums[i] * nums[i];
            sorted_arr[i] = square_of_num;
            Arrays.sort(sorted_arr);
        }
        for (int i = 0; i < sorted_arr.length; i++) {
            Arrays.sort(sorted_arr);
        }

        return sorted_arr;
    }
}