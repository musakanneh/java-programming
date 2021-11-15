package Easy.String.TwoPointers.Easy;

/***
 * Given an array arr of integers, check if there exists two integers
 * N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */
public class CheckIfExist {
    public static void main(String[] args) {
        System.out.println(checkIfExist());
    }

    public static boolean checkIfExist() {
        int[] arr = {-2,0,10,-19,4,6,-8};

        for (int i = 0;  i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 && i != j){
                    return true;
                }
            }
        }
        return false;
    }
}