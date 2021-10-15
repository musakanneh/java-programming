package Concepts.String;

import java.util.ArrayList;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if
 * sentence is a pangram, or false otherwise.
 */
public class CheckIfPangram {

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String sentence) {
        int sentence_size = 26;

        if (sentence.length() < sentence_size) {
            return false;
        }
        ArrayList<Character> alphabets = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
            if (!alphabets.contains(sentence.charAt(i))) {
                alphabets.add(sentence.charAt(i));
            }
            if (alphabets.size() == sentence_size) {
                return true;
            }
        }
        return false;
    }
}