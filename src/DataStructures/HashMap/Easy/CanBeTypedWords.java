package DataStructures.HashMap.Easy;

/***
 * There is a malfunctioning keyboard where some letter keys do not work.
 * All other keys on the keyboard work properly.
 *
 * Given a string text of words separated by a single space (no leading or trailing spaces)
 * and a string brokenLetters of all distinct letter keys that are broken,
 * return the number of words in text you can fully type using this keyboard.
 *
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 */
public class CanBeTypedWords {
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
    }

    static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] words = text.split(" ");

        for(int i = 0; i < words.length; i++) {
            boolean is_broken = false;

            for (char ch : brokenLetters.toCharArray()) {
                if(words[i].indexOf(ch) >= 0) {
                    is_broken = true; break;
                }
            }
            if (!is_broken) count++;
        }
        return count;
    }
}