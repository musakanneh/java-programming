package Easy.String.TwoPointers.Easy;

import java.util.Arrays;

/***
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 *
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        char [] ch = s.toCharArray(); int left = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                sb.append(reverseWords(Arrays.copyOfRange(ch, left, i)));
                left = i + 1; sb.append(ch[i]);
            } else if (i == ch.length - 1) {
                sb.append(reverseWords(Arrays.copyOfRange(ch, left, i + 1)));
            }
        }
        return sb.toString();
    }

    static String reverseWords(char [] ch) {
        for (int left = 0, right = ch.length - 1; left < right;) {
            char temp = ch[left];
            ch[left++] = ch[right];
            ch[right--] = temp;
        }
        return new String(ch);
    }
}