package SOLUTION;

import java.util.*;

class Solution {

    // 1. Recursive Solution
    // TC -- O(N^N) and SC -- O(N)
    // public static int Rec(int[] coins, int amount) {

    // // Base Case
    // if (amount == 0)
    // return 0;
    // if (amount < 0)
    // return Integer.MAX_VALUE;

    // int mini = Integer.MAX_VALUE;
    // for (int i = 0; i < coins.length; i++) {
    // int ans = Rec(coins, amount - coins[i]);
    // if (ans != Integer.MAX_VALUE)
    // mini = Math.min(mini, 1 + ans);
    // }
    // return mini;
    // }

    // public static int coinChange(int[] coins, int amount) {
    // int ans = Rec(coins, amount);
    // if (ans == Integer.MAX_VALUE) return -1;
    // return ans;
    // }


    // 2. Top Down Approach -- Recursion + Memoization
    // TC -- O(amount) and SC -- O(N)
    // public static int topDown(int[] coins, int amount, int[] dp) {
    //     // Base Case
    //     if (amount == 0)
    //         return 0;
    //     if (amount < 0)
    //         return Integer.MAX_VALUE;
    //     if (dp[amount] != -1)
    //         return dp[amount];

    //     int mini = Integer.MAX_VALUE;
    //     for (int i = 0; i < coins.length; i++) {
    //         int ans = topDown(coins, amount - coins[i], dp);
    //         if (ans != Integer.MAX_VALUE)
    //             mini = Math.min(mini, 1 + ans);
    //     }
    //     dp[amount] = mini;
    //     return dp[amount];
    // }

    // public static int coinChange(int[] coins, int amount) {
    //     int n = amount;
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp, -1);
    //     int ans = topDown(coins, amount, dp);
    //     if (ans != Integer.MAX_VALUE)
    //         return ans;
    //     return -1;
    // }


    
    public static void main(String[] args) {
        // Main Function
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
