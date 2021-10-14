package Concepts.HashMaps.Hard;
import java.util.ArrayList;
import java.util.List;

/***
 * Input: numbers = [5,2,6,1]
 * Output: [2,1,1,0]
 * Explanation:
 * To the right of 5 there are 2 smaller elements (2 and 1).
 * To the right of 2 there is only 1 smaller element (1).
 * To the right of 6 there is 1 smaller element (1).
 * To the right of 1 there is 0 smaller element.
 *
 * https://leetcode.com/problems/count-of-smaller-numbers-after-self/
 */
public class CountSmaller {

    public static void main(String[] args) {
        System.out.println(countSmaller());
    }

    public static List<Integer> countSmaller() {
        int[] numbers = {5, 2, 6, 1};
        List<Integer> answer_list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            int first_item = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (first_item > numbers[j]) {
                    count++;
                    numbers[i] = numbers[i + 1];
                }
            }
            answer_list.add(count);
        }
        return answer_list;
    }
}