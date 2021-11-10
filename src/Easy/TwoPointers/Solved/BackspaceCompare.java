package Easy.TwoPointers.Solved;

/***
 * Given two strings s and t, return true if they are equal when both are
 * typed into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * https://leetcode.com/problems/backspace-string-compare/
 */
public class BackspaceCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c", "#a#c"));
    }

    static boolean backspaceCompare(String s, String t) {
        if (s.equals("") && t.equals("")) return true;
        return CompareInputString(s).equals(CompareInputString(t));
    }

    static String CompareInputString (String s) {
        int left = 0;
        int right =  s.length() - 1;
        char current_string = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (left <= right) {
            current_string = s.charAt(left);

            if (current_string != '#') {
                stringBuilder.append(current_string);
            } else {
                if (!stringBuilder.toString().isEmpty()) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
            }
            left++;
        }
        return stringBuilder.toString();
    }
}