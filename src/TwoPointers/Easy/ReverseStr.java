package TwoPointers.Easy;

/***
 * Given a string s and an integer k, reverse the first k characters
 * for every 2k characters counting from the start of the string.
 *
 * If there are fewer than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and left the other as original.
 *
 * https://leetcode.com/problems/reverse-string-ii/
 */
public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 4));
    }

    static String reverseStr(String s, int k) {
        char [] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i += 2 * k) {
            int left = i, right = Math.min(i + k - 1, ch.length - 1);

            while (left < right) {
                char temp = ch[left];
                ch[left++] = ch[right];
                ch[right--] = temp;
            }
        }
        return String.copyValueOf(ch);
    }
}