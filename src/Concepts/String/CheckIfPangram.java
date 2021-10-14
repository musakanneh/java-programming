package Concepts.String;

/***
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
//        String alphabet = "abcdefghijklmnopqrstuvwxzy";
        String alphabet = "leetcode";

        for (char i : sentence.toCharArray()) {
            for (char alp : alphabet.toCharArray()) {
                if (i == alp) {
                    return true;
                }
            }
         }
        return false;
    }
}
