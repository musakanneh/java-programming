package TwoPointers.Easy;

/***
 * Given a 1-indexed array of integers numbers that is already sorted
 * in non-decreasing order, find two numbers such that they add up to a
 * specific target number. Let these two numbers be numbers[index1] and
 * numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by
 * one as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution.
 * You may not use the same element twice.
 *
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum());
    }

    static int[] twoSum() {
        int[] numbers = {2, 7, 11, 15}; int target = 9;
        int left = 0, right = numbers.length - 1;
        int [] result = new int[2];

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                result[0] = left + 1; result[1] = right + 1;
                left++; right--;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
