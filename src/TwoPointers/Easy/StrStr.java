package TwoPointers.Easy;

/**
 * Return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 * Clarification:
 *  What should we return when needle is an empty string?
 *  This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 * This is consistent to C's strstr() and Java's indexOf().
 *
 * https://leetcode.com/problems/implement-strstr/
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;

        int haystack_len = haystack.length();
        int needle_len = needle.length();

        if (haystack_len < needle_len) return -1;
        String temp = "";

        for (int i = 0; i <= haystack_len - needle_len; i++) {
            temp = haystack.substring(i, i + needle_len);

            if (temp.equals(needle)) return i;
        }
        return -1;
     }
}