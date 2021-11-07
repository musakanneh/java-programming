package Easy.TwoPointers;

import java.util.HashSet;

/***
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class Intersection {
    public static void main(String[] args) {
        System.out.println(intersection());
    }

    static int [] intersection() {
        int[] nums1 = {4, 9, 5}; int[] nums2 = {9, 4, 9, 8, 4};
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums1) set.add(i);

        HashSet<Integer> set_intersect = new HashSet<>();

        for (int i : nums2) {
            if (set.contains(i)) set_intersect.add(i);
        }

        int []  result = new int [set_intersect.size()];
        int index = 0;

        for (int i : set_intersect) result[index++] = i;
        return result;
    }
}
