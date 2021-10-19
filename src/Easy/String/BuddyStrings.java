package Easy.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/***
 * Given two strings s and goal, return true if you can swap two letters
 * in s so the result is equal to goal, otherwise, return false.
 *
 * Swapping letters is defined as taking two indices i and j (0-indexed)
 * such that i != j and swapping the characters at s[i] and s[j].
 *
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 */
public class BuddyStrings {
    public static void main(String[] args) {
        System.out.println(buddyStrings("abcd", "badc"));
        System.out.println(buddyStrings("ab", "ba"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        List<Integer> diff = new ArrayList<>();

        if (s.equals(goal)) {
            HashSet<Character> unique_chars = new HashSet<>();
            for (char c : s.toCharArray()) {
                unique_chars.add(c);
            }
            return (unique_chars.size() < s.length());
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }

        return  (diff.size() == 2 &&
                s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) &&
                goal.charAt(diff.get(0)) == s.charAt(diff.get(1)));
    }
}