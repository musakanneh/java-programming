package ProblemSolving.HashMap.Easy;
import java.util.HashMap;

/***
 * You are given an array of strings words and a string chars.
 *
 * A string is good if it can be formed by characters from chars
 * (each character can only be used once).
 *
 * Return the sum of lengths of all good strings in words.
 *
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class CountCharacters {
    public static void main(String[] args) {
        System.out.println(countCharacters("atach"));
    }

    static int countCharacters(String chars) {
        String[] words = {"cat", "bt", "hat", "tree"};
        HashMap<Character, Integer> map =  new HashMap<>(); int result = 0;

        for (char ch : chars.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (String word : words) {
            boolean isTestPassed = false; int [] count = new int[26];

            for (char ch : word.toCharArray()) count[ch - 'a'] ++;
            for (char ch : word.toCharArray()) {
                int char_count = count[ch - 'a'];

                if (!map.containsKey(ch)) {
                    isTestPassed = false; break;
                } else if (map.containsKey(ch) && map.get(ch) >= char_count) {
                    isTestPassed = true;
                } else if (map.containsKey(ch) && map.get(ch) < char_count) {
                    isTestPassed = false; break;
                }
            }
            if (isTestPassed) {
                result += word.length();
            }
        }

        return result;
    }
}