package Concepts.HashMaps.Easy;

/**
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 * Example 1:
 *  Input: nums = [1,2,3,1,1,3]
 *  Output: 4
 *  Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 *
 *  https://leetcode.com/problems/number-of-good-pairs/
 */

public class NumberIdenticalPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs());
    }

    public static int numIdenticalPairs() {
        int [] nums = {1,2,3,1,1,3};

        return nums[0];
    }
}
