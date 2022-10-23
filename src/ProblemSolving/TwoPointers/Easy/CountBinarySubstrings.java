package ProblemSolving.TwoPointers.Easy;

/***
 * Give a binary string s, return the number of non-empty substrings
 * that have the same number of 0's and 1's, and all the 0's and all
 * the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 * https://leetcode.com/problems/count-binary-substrings/
 */
public class CountBinarySubstrings {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    static int countBinarySubstrings(String s) {
        int total_sum = 0; int index = 1;
        int prev = 0; int count = 1;

        while (index < s.length()) {
            if (s.charAt(index - 1) != s.charAt(index)) {
                total_sum += Math.min(prev, count);
                prev = count;
                count = 1;
            } else {
                count++;
            }
            index++;
        }
        return total_sum += Math.min(prev, count);
    }
}