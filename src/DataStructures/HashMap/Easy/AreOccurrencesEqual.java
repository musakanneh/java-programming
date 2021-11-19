package DataStructures.HashMap.Easy;

import java.util.HashMap;

/***
 * Given a string s, return true if s is a good string, or false otherwise.
 *
 * A string s is good if all the characters that appear in s have the same number
 * of occurrences (i.e., the same frequency).
 *
 * https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
 */
public class AreOccurrencesEqual {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbco"));
    }

    static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> str_feq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            str_feq.put(ch, str_feq.getOrDefault(ch, 0) + 1);
        }
        int count = str_feq.get(s.charAt(0));

        for (Integer value : str_feq.values()) {
            if (value != count) return false;
        }

        return true;
    }
}