package Easy.TwoPointers.Solved;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given two integer arrays nums1 and nums2, return an
 * array of their intersection. Each element in the result
 * must appear as many times as it shows in both arrays and
 * you may return the result in any order.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class Intersect {
    public static void main(String[] args) {
        System.out.println(intersect());
    }

    static int[] intersect() {
        int[] nums1 = {1, 2, 2, 1}; int[] nums2 = {2, 2};

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0; Arrays.sort(nums1); Arrays.sort(nums2);

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                result.add(nums1[i]);
                i++; j++;
            }
        }

        int [] intersect =  new int[result.size()];
        for (i = 0; i < result.size(); i++) {
            intersect[i] = result.get(i);
        }
        return intersect;
    }
}