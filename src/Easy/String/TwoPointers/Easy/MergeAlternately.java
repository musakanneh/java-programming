package Easy.String.TwoPointers.Easy;

/**
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the
 * additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class MergeAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    static String mergeAlternately(String word1, String word2) {
        int left = 0, right = 0;
        StringBuilder merged_words = new StringBuilder();

        while (left < word1.length() && right < word2.length()) {
            merged_words.append(word1.charAt(left));
            merged_words.append(word2.charAt(right));
            left++; right++;
        }
        if (word1.length() > word2.length()) {
            merged_words.append(word1.substring(word2.length()));
        } else  if (word1.length() < word2.length()) {
            merged_words.append(word2.substring(word1.length()));
        }

        return merged_words.toString();
    }
}
