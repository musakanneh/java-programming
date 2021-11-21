package DataStructures.HashMap.Easy;

import java.util.HashMap;

/***
 * You are given an integer array nums with the following properties:
 *
 * nums.length == 2 * n.
 * nums contains n + 1 unique elements.
 * Exactly one element of nums is repeated n times.
 * Return the element that is repeated n times.
 *
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class RepeatedNTimes {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes());
    }

    static int repeatedNTimes() {
        int[] nums = {1, 2, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int repeated_num = nums[i];
            if (map.containsValue(repeated_num)) {
                return repeated_num;
            } else {
                map.put(i, repeated_num);
            }
        }
        return 0;
    }
}