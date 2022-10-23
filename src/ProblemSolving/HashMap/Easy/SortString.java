package ProblemSolving.HashMap.Easy;

/***
 * Given a string s. You should re-order the string using the following algorithm:
 *
 * Pick the smallest character from s and append it to the result.
 * Pick the smallest character from s which is greater than the last appended character to the result and append it.
 * Repeat step 2 until you cannot pick more characters.
 * Pick the largest character from s and append it to the result.
 * Pick the largest character from s which is smaller than the last appended character to the result and append it.
 * Repeat step 5 until you cannot pick more characters.
 * Repeat the steps from 1 to 6 until you pick all characters from s.
 * In each step, If the smallest or the largest character appears more than once you can choose any
 * occurrence and append it to the result.
 *
 * Return the result string after sorting s with this algorithm.
 *
 * https://leetcode.com/problems/increasing-decreasing-string/
 */
public class SortString {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
    }

    static String sortString(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int [] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        while (sb.length() < s.length()) {
            helper(sb, freq, true);
            helper(sb, freq, false);
        }

        return sb.toString();
    }

    static void helper(StringBuilder sb, int[]freq, boolean d) {
        for (int i = 0; i < 26; i++) {
            int j = d ? i : 25 - i;

            if (freq[j]-- > 0) {
                sb.append((char) (j + 'a'));
            }
        }
    }
}