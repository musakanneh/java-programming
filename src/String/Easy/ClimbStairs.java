package String.Easy;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 *
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n) {
        if (n == 1) return n;

        int [] step_count = new int[n + 1];
        step_count[1] = 1; step_count[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            step_count[i] = step_count[i - 1] + step_count[i - 2];
        }

        return step_count[n];
    }
}