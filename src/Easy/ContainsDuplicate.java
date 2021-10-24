package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate());
    }

    public static boolean containsDuplicate() {
        int[] nums = {1, 2, 3, 4, 1};
        HashSet<Integer> unique_val = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (unique_val.contains(nums[i])) {
                return true;
            } else {
                unique_val.add(nums[i]);
            }
        }
        return false;
    }
}
