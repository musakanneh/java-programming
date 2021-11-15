package Easy.String.TwoPointers.Easy;

import java.util.Arrays;

/***
 * Given a string s and a character c that occurs in s,
 * return an array of integers answer where answer.length == s.length and
 * answer[i] is the distance from index i to the closest occurrence of character c in s.
 *
 * The distance between two indices i and j is abs(i - j),
 * where abs is the absolute value function.
 *
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 */
public class ShortestToChar {
    public static void main(String[] args) {
        System.out.println(shortestToChar("loveleetcode", 'e'));
    }

    static int[] shortestToChar(String s, char c) {
        int s_len = s.length();
        int [] result = new int[s_len];
        int c_position = -s_len;

        for (int i = 0; i < s_len; i++) {
            if (s.charAt(i) == c) c_position = i;
            result[i] = i - c_position;
        }

        for (int i = s_len - 1; i >= 0; i--) {
            if (s.charAt(i) == c) c_position = i;
            result[i] = Math.min(result[i], Math.abs(i - c_position));
        }

        System.out.println(Arrays.toString(result));
        return result;
     }
}