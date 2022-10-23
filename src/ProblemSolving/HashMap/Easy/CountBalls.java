package ProblemSolving.HashMap.Easy;

import java.util.HashMap;

/***
 * You are working in a ball factory where you have n balls numbered from
 * lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1),
 * and an infinite number of boxes numbered from 1 to infinity.
 *
 * Your job at this factory is to put each ball in the box with a number equal
 * to the sum of digits of the ball's number. For example, the ball number 321 will
 * be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.
 *
 * Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.
 *
 * https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 */
public class CountBalls {
    public static void main(String[] args) {
        System.out.println(countBalls(1, 10));
        System.out.println(countBalls2(1, 10));
    }

    static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> sum_count = new HashMap<>();
        int count = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0, temp = i;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            sum_count.put(sum, sum_count.getOrDefault(sum, 0) + 1);
            count = sum_count.get(sum) > count ? sum_count.get(sum) : count;
        }
        return count;
    }

    static int countBalls2(int lowLimit, int highLimit) {
        int max = 0;
        int [] arr = new int[50];

        for (int i = lowLimit; i <= highLimit; i++) {
            arr[countSum(i)]++;
        }
        for (int i = 0; i < 50; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static int countSum(int number) {
        int sum  = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}