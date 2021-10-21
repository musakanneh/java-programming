package Easy.String;
import java.util.*;

/**
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 * https://leetcode.com/problems/number-of-good-pairs/
 */
public class NumberIdenticalPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs());
    }

    public static int numIdenticalPairs1() {
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
        int MAX_LEN = 101; int [] nums = {1,2,3,1,1,3};
        int good_pairs = 0; int [] freq = new int[MAX_LEN];

        for (int i = 0; i < nums.length; i++)
            freq[nums[i]]++;
        for (int i = 0; i < MAX_LEN; i++) {
            if (freq[i] > 1) {
                good_pairs += ((freq[i] - 1) * (freq[i])) / 2;
            }
        }

        return good_pairs;
    }

    public static int numIdenticalPairs() {
        int [] nums = {1, 1, 1, 1}; int freq_count = 0;
        HashMap<Integer, Integer> good_pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int element_at_index = nums[i];

            if (good_pairs.containsKey(element_at_index)) {
                freq_count += good_pairs.get(element_at_index);
                good_pairs.put(element_at_index, good_pairs.get(element_at_index) + 1);
            } else {
                good_pairs.put(element_at_index, 1);
            }
        }

        return freq_count;
    }
}