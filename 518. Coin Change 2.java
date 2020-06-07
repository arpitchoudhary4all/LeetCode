/*
You are given coins of different denominations and a total amount of money.
Write a function to compute the number of combinations that make up that amount.
You may assume that you have infinite number of each kind of coin.
*/

class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0] = 1;
        for(int i = 1; i < dp.length; i++) {
            dp[i][0] = 1;
            for(int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i-1][j] + ((j  >= coins[i - 1])? dp[i][j - coins[i-1]] : 0);
            }
        }
        return dp[coins.length][amount];
    }
}
