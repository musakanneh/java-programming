package ProblemSolving.String.Easy;

/**
 * Given a string s, return true if the s can be palindrome
 * after deleting at most one character from it.
 *
 * https://leetcode.com/problems/valid-palindrome-ii/
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        int left = 0; int right = s.length() - 1;

        while (left <= right) {
             if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) ||
                        isPalindrome(s, left, right - 1);
             }
            left++; right--;
        }

        return true;
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}