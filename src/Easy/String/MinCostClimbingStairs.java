package Easy.String;

/**
 * You are given an integer array cost where cost[i] is the cost of
 * ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs());
    }

    public static int minCostClimbingStairs() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int zero = cost[0]; int one = cost[1];
        int count = 0;

        for (int i = 2; i < cost.length; i++) {
            count = cost[i] + Math.min(zero, one);
            zero = one; one = count;
        }

        return Math.min(zero, one);
    }
}