package ProblemSolving.String.Easy;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice. You can return the answer
 * in any order.
 *
 * https://leetcode.com/problems/two-sum/
 * */
public class TwoNumberSum {
    public static void main(String[] args) {
        System.out.println(twoSum(9));
    }

    public static int[] twoSum(int target) {
        int[] numbers = {2, 7, 11, 15};
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int target_sum = target - numbers[i];

            if (result.containsKey(target_sum)) {
                return new int[]{result.get(target_sum), i};
            }
            result.put(numbers[i], i);
        }

        return new int []{};
    }
}