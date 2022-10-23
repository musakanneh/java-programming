package ProblemSolving.HashMap.Easy;
import java.util.HashMap;

/***
 * You are given an integer array nums. The unique elements
 * of an array are the elements that appear exactly once in the array.
 *
 * Return the sum of all the unique elements of nums.
 *
 * https://leetcode.com/problems/sum-of-unique-elements/
 */
public class SumOfUnique {
    public static void main(String[] args) {
        System.out.println(sumOfUnique());
    }

    static int sumOfUnique() {
        int[] nums = {1, 2, 3, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) count += key;
       }
        return count;
    }
}
