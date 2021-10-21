package Easy;

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
        int left_pointer = 0;
        int right_pointer = s.length() - 1;

        while (left_pointer <= right_pointer) {
             if (s.charAt(left_pointer) != s.charAt(right_pointer)) {
                return isPalindrome(s, left_pointer + 1, right_pointer) ||
                        isPalindrome(s, left_pointer, right_pointer - 1);
             }
            left_pointer++; right_pointer--;
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