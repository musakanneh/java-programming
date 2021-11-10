package Easy.TwoPointers.Solved;
/***
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return anything.
 *
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * https://leetcode.com/problems/duplicate-zeros/
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        System.out.println();
    }

    static void duplicateZerosSolutionOne() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[i - 1];
                }
                i++;
            }
        }
    }

    static void duplicateZeros() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        int possible_duplicates = 0;
        int arr_len = arr.length - 1;

        for (int left = 0; left < arr_len - possible_duplicates; left++) {
            if (arr[left] == 0) {
                if (left == arr_len - possible_duplicates) {
                    arr[arr_len] = 0;
                    arr_len--;
                    break;
                }
                possible_duplicates++;
            }
        }

        int last = arr_len - possible_duplicates;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possible_duplicates] = 0;
                possible_duplicates--;
                arr[i + possible_duplicates] = 0;
            } else {
                arr[i + possible_duplicates] = arr[i];
            }
        }
    }
}