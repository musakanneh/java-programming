package ProblemSolving.TwoPointers.Easy;

import java.util.HashSet;

/***
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
 *
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    static String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('A'); vowels.add('a');
        vowels.add('E'); vowels.add('e');
        vowels.add('I'); vowels.add('i');
        vowels.add('O'); vowels.add('o');
        vowels.add('U'); vowels.add('u');

        char [] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        return new String(chars);
    }
}