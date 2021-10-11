package Easy;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * https://leetcode.com/problems/valid-anagram/
 */

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram2("rat", "tar"));
        System.out.println(isAnagram2("anagram", "nagaram"));
    }

    public static boolean isAnagram1(String s, String t) {
        /***
         * convert both strings in character arrays, then sort the array
         * convert back to string and compare the results
         */
        char [] stringOfS = s.toCharArray();
        char [] stringOft = t.toCharArray();

        Arrays.sort(stringOfS); Arrays.sort(stringOft);

        String sToString = new String(stringOfS);
        String tToString = new String(stringOft);

        return sToString.equals(tToString);
    }

    public static boolean isAnagram2(String s, String t) {
        /**
         * @params:
         *  s: first input string
         *  t: second input string
         *
         * @soln:
         *  create an array of the all alphabets
         *  loop through the input strings and track their characters:
         *      first input string increments, while the second input string decrements
         *  then, return the state of the character count
         */
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