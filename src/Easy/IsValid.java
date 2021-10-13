package Easy;

import java.util.Arrays;

/**
 * Given a string s containing just the characters
 * '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *  1. Open brackets must be closed by the same type of brackets.
 *  2. Open brackets must be closed in the correct order.
 *
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Input: s = "()[]{}"
 * Output: true
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        String [] opening_brackets = {"(", "[", "{"};
        String [] closing_brackets = {")", "]", "}"};

        return false;
    }
}