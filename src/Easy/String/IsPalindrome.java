package Easy.String;

/**
 * Given a string s, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 *
 * https://leetcode.com/problems/valid-palindrome/
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        String valid_string_set = "";

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                valid_string_set += ch;
            }
        }
        valid_string_set = valid_string_set.toLowerCase();
        int left = 0; int right = valid_string_set.length() - 1;

        while (left <= right) {
            if (valid_string_set.charAt(left) != valid_string_set.charAt(right)) {
                return false;
            }
            left++; right--;
        }

        return true;
    }
}
