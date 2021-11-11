package Easy.TwoPointers.Solved;

import java.util.Arrays;

/**
 * A permutation perm of n + 1 integers of all the integers in the range [0, n]
 * can be represented as a string s of length n where:
 *
 * s[i] == 'I' if perm[i] < perm[i + 1], and
 * s[i] == 'D' if perm[i] > perm[i + 1].
 * Given a string s, reconstruct the permutation perm and return it.
 * If there are multiple valid permutations perm, return any of them.
 *
 * https://leetcode.com/problems/di-string-match/
 */
public class DiStringMatch {
    public static void main(String[] args) {
        System.out.println(diStringMatch("IDID"));
    }

    static int[] diStringMatch(String s) {
        int size = s.length();
        int low = 0; int high = size;
        int [] result = new int[size + 1];

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[size] = high;
        return result;
    }
}