package Easy.HashMaps;

/**
 * Given the array nums, for each nums[i] find out how many
 * numbers in the array are smaller than it. That is, for each nums[i]
 * you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 *
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        System.out.println(smallerNumbersThanCurrent());
    }

    public static int[] smallerNumbersThanCurrent() {
        int [] numbers = {8,1,2,2,3};
        int [] num_ordering = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    count++;
                }
            }
            num_ordering[i] = count;
        }
        return num_ordering;
    }

//    public static int[] smallerNumbersThanCurrent() {
//        // TODO: Solve using hashmap
//        return null;
//    }
}