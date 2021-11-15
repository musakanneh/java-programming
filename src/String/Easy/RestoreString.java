package String.Easy;

/***
 * Given a string s and an integer array indices of the same length.
 *
 * The string s will be shuffled such that the character at the ith
 * position moves to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 * https://leetcode.com/problems/shuffle-string/
 */
public class RestoreString {

    public static void main(String[] args) {
        System.out.println(restoreString());
    }

    public static String restoreString() {
        String string = "codeleet";
        int [] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        StringBuilder shuffled_string = new StringBuilder(string);

        for (int i = 0; i < string.length(); i++) {
            shuffled_string.setCharAt(indices[i], string.charAt(i));
        }

        return shuffled_string.toString();
    }
}