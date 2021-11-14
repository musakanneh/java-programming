package Easy.TwoPointers.Solved;

/**
 * Given a 0-indexed string word and a character ch, reverse the segment of word that
 * starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
 * If the character ch does not exist in word, do nothing.
 *
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that
 * starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 *
 * Return the resulting string.
 *
 * https://leetcode.com/problems/reverse-prefix-of-word/
 */
public class ReversePrefix {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

    static String reversePrefix(String word, char ch) {
        StringBuilder string_builder = new StringBuilder();
        boolean word_found = false; int  i = 0;

        while (i < word.length()) {
            string_builder.append(word.charAt(i));

            if (word.charAt(i) == ch && !word_found) {
                string_builder.reverse();
                word_found = true;
            }
            i++;
        }

        return string_builder.toString();
    }
}