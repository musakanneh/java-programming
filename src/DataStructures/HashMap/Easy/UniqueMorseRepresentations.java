package DataStructures.HashMap.Easy;

import java.util.HashSet;

/***
 * International Morse Code defines a standard encoding where each letter
 * is mapped to a series of dots and dashes, as follows:
 *
 * 'a' maps to ".-",
 * 'b' maps to "-...",
 * 'c' maps to "-.-.", and so on.
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.
 * ","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Given an array of strings words where each word can be written as a concatenation
 * of the Morse code of each letter.
 *
 * For example, "cab" can be written as "-.-..--...", which is the concatenation
 * of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
 * Return the number of different transformations among all words we have.
 *
 * https://leetcode.com/problems/unique-morse-code-words/
 */
public class UniqueMorseRepresentations {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations());
    }

    static int uniqueMorseRepresentations() {
        String[] words = {"gin", "zen", "gig", "msg"};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> hash_set = new HashSet<>();

        for (String word : words) {
            StringBuilder transformation = new StringBuilder();

            for (char ch : word.toCharArray()) {
                transformation.append(morse[ch - 'a']);
            }
            hash_set.add(transformation.toString());
        }

        return hash_set.size();
    }
}