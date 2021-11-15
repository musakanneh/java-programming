package TwoPointers.Easy;

/***
 * Given two integer arrays arr1 and arr2, and the integer d,
 * return the distance value between the two arrays.
 *
 * The distance value is defined as the number of elements arr1[i]
 * such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
 *
 * https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
 */
public class FindTheDistanceValue {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(6));
    }

    static int findTheDistanceValue(int d) {
        int[] arr1 = {2, 1, 100, 3}; int[] arr2 = {-5, -2, 10, -3, 7};
        int count = arr1.length;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int diff = Math.abs(arr1[i] - arr2[j]);
                if (diff <= d) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}