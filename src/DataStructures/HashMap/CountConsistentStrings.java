package DataStructures.HashMap;

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

        return words.length;
    }
}
