package DataStructures.HashMap.Easy;
import java.util.HashMap;

/***
 * Given two integer arrays of equal length target and arr.
 *
 * In one step, you can select any non-empty sub-array of arr and reverse it.
 * You are allowed to make any number of steps.
 *
 * Return True if you can make arr equal to target, or False otherwise.
 *
 * https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 */
public class CanBeEqual {
    public static void main(String[] args) {
        System.out.println(canBeEqual());
    }

    static boolean canBeEqual() {
        int[] target = {3, 7, 9}; int[] arr = {3, 7, 11};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int t : target) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        for (int a : arr) {
            if (map.containsKey(a) && map.get(a) > 0) {
                map.put(a, map.get(a) - 1);
            } else return false;
        }

        return true;
    }
}