package String.Easy;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * https://leetcode.com/problems/valid-anagram/
 */
public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("rat", "tar"));
    }

    public static boolean isAnagram1(String s, String t) {
        char [] stringOfS = s.toCharArray();
        char [] stringOft = t.toCharArray();

        Arrays.sort(stringOfS); Arrays.sort(stringOft);

        String sToString = new String(stringOfS);
        String tToString = new String(stringOft);

        return sToString.equals(tToString);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] char_count = new int [26];

        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i) - 'a'] ++;
            char_count[t.charAt(i) - 'a'] --;
        }

        for (int count : char_count) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}