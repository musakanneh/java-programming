package Concepts.HashMaps.Easy;
import java.util.HashMap;

/**
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 * Example 1:
 *  Input: nums = [1,2,3,1,1,3]
 *  Output: 4
 *  Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

public class NumberIdenticalPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs1());
        System.out.println(numIdenticalPairs2());
//        System.out.println(numIdenticalPairs());
    }

    public static int numIdenticalPairs1() {
        /**
         * brute force solution: (n - 1) * (n) / 2
         */
        int [] nums = {1,2,3,1,1,3};
        int good_pair = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])  {
                    good_pair++;
                }
            }
        }
        return good_pair;
    }

    public static int numIdenticalPairs2() {
        /**
         * combinatorics approach: (n - 1) * (n) / 2
         *
         * Indicate req limit using an array
         * traverse the array and track elements' req
         * apply a combinatorics approach to items with > 1 freq
         */
        int [] nums = {1,2,3,1,1,3};
        int MAX_LEN = 101;
        int good_pairs = 0;
        int [] freq = new int[MAX_LEN];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int i = 0; i < MAX_LEN; i++) {
            if (freq[i] > 1) {
                good_pairs += ((freq[i] - 1) * (freq[i])) / 2;
            }
        }
        return good_pairs;
    }

    public static HashMap<Integer, Integer> numIdenticalPairs() {
        /**
         * Solution using hashmap
         */
        int [] nums = {1,2,3,1,1,3};
        HashMap<Integer, Integer> good_pairs = new HashMap<>();

        for (int num : nums) {
//            if (num == good_pairs)
        }
        return good_pairs;
    }
}