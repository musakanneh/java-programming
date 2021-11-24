package DataStructures.HashMap.Easy;
import java.util.HashMap;
import java.util.Map;

/***
 * Given an array of integers nums, sort the array in increasing order
 * based on the frequency of the values. If multiple values have the same
 * frequency, sort them in decreasing order.
 *
 * Return the sorted array.
 *
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/
 */
public class FrequencySort {
    public static void main(String[] args) {
        System.out.println(frequencySort());
    }

    static int[] frequencySort() {
        int[] nums = {1, 1, 2, 2, 2, 3};
        HashMap<Integer, Integer> map = new HashMap<>(); int index = 0;

        for (int  num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        while (!map.isEmpty()) {
            int min_value  = 1000, k = 0, current_value = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                current_value = entry.getValue();

                if (current_value < min_value) {
                    k = entry.getKey(); min_value = current_value;

                } else if (current_value == min_value) {
                    if (k < entry.getKey()) k = entry.getKey();
                }
            }
            while (min_value != 0) {
                nums[index++] = k;
                min_value--;
            }
            map.remove(k);
        }

        return nums;
    }
}