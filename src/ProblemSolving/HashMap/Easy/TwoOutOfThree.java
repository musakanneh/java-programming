package ProblemSolving.HashMap.Easy;
import java.util.ArrayList;

/***
 * Given three integer arrays nums1, nums2, and nums3, return a
 * distinct array containing all the values that are present in at
 * least two out of the three arrays. You may return the values in any order.
 *
 * https://leetcode.com/problems/two-out-of-three/
 */
public class TwoOutOfThree {
    public static void main(String[] args) {
        System.out.println(twoOutOfThree());
    }

    public static ArrayList<Integer> twoOutOfThree() {
        int[] nums1 = {1, 1, 3, 2}; int[] nums2 = {2, 3}; int[] nums3 = {3};

        int[] arr1 = new int[101]; int[] arr2 = new int[101];
        int[] arr3 = new int[101];

        for (int e : nums1) {
            arr1[e] = 1;
        }

        for (int e : nums2) arr2[e] = 1;
        for (int e : nums3) arr3[e] = 1;

        ArrayList<Integer> res = new ArrayList();

        for (int i = 1; i < 101; i++) {
            if (arr1[i] + arr2[i] + arr3[i] >= 2) {
                res.add(i);
            }
        }
        return res;
    }
}
