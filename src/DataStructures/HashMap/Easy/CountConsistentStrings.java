package DataStructures.HashMap.Easy;
import java.util.HashSet;

/***
 * You are given a string allowed consisting of distinct characters
 * and an array of strings words. A string is consistent if all
 * characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 *
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */
public class CountConsistentStrings {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab"));
    }

    static int countConsistentStrings(String allowed) {
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        HashSet<Character> set = new HashSet<>(); int count = 0;

        for (char ch : allowed.toCharArray()) set.add(ch);

        for (String word : words) {
            boolean found = true;

            for (char ch : word.toCharArray()) {
                if (!set.contains(ch)) {
                    found = false; break;
                }
            }
            if (found) count++;
        }
        return count;
    }
}