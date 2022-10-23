package ProblemSolving.TwoPointers.Easy;

/***
 * Given a string s, reverse the string according to the following rules:
 *
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 *
 * Return s after reversing it.
 *
 * https://leetcode.com/problems/reverse-only-letters/
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }

    static String reverseOnlyLetters(String s) {
        char [] ch = s.toCharArray();

        for (int left = 0, right = ch.length - 1; left < right;) {
            if (!Character.isLetter(ch[left])) left++;
            else if (!Character.isLetter(ch[right])) right++;
            else {
                char temp = ch[left];
                ch[left++] = ch[right];
                ch[right--] = temp;
            }
        }
        return String.copyValueOf(ch);
    }
}
