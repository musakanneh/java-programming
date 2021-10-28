package Easy;

import java.util.HashSet;

/***
 * Find duplicate
 * Given an array of integers nums containing n + 1 integers where
 * each integer is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses
 * only constant extra space.
 *
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindDuplicate {
    public static void main(String[] args) {
        System.out.println(findDuplicate());
    }

    public static int findDuplicate() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int tortoise = nums[0], hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        tortoise = nums[0];

        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return tortoise;
    }
}
