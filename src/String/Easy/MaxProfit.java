package String.Easy;

/***
 * Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a
 * different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit());
    }

    static int maxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int min_price = prices[0]; int max_profit = 0;

        for (int price : prices) {
            min_price = Math.min(min_price, price);
            int current_profit = price - min_price;
            max_profit = Math.max(max_profit, current_profit);
        }
        return max_profit;
    }
}