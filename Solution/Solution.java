package SOLUTION;

import java.util.*;

// 1. Recursive Solution

class Solution {
    // TC -- O(N^N) and SC -- O(N)
    public static int Rec(int[] coins, int amount) {

        // Base Case
        if (amount == 0)
            return 0;
        if (amount < 0)
            return Integer.MAX_VALUE;
        
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = Rec(coins, amount - coins[i]);
            if (ans != Integer.MAX_VALUE)
                mini = Math.min(mini, 1 + ans);
        }
        return mini;
    }

    public static int coinChange(int[] coins, int amount) {
        // 1. Recursive Solution
         int ans = Rec(coins, amount);
         if (ans == Integer.MAX_VALUE) return -1;
         return ans;
    }

    public static void main(String[] args) {
        //Main Function
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
