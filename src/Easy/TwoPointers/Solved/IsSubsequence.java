package Easy.TwoPointers.Solved;

/***
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by
 * deleting some (can be none) of the characters without disturbing the relative positions
 * of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {

        int s_index = 0;

        if (s.equals("")) return true;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(s_index)) {
                s_index++;
            }
            if (s_index >= s.length()) return true;
        }
        return false;
    }
}