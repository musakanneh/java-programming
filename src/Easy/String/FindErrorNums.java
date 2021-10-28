package Easy.String;

/***
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another
 * number in the set, which results in repetition of one number and loss of another number.
 *
 * You are given an integer array nums representing the data status of this set after the error.
 *
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 *
 * https://leetcode.com/problems/set-mismatch/
 */
public class FindErrorNums {
    public static void main(String[] args) {
        System.out.println(findErrorNums());
    }

    public static int [] findErrorNums() {
        int [] nums = {1, 2, 2, 4};
        int [] arr = new int[nums.length];
        int [] result = new int[2];

        for (int n : nums) {
            arr[n - 1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == 2) {
                result[0] = i + 1;
            }
            if (arr[i] == 0) {
                result[1] = i + 1;
            }
        }
        return result;
    }
}