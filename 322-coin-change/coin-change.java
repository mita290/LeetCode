class Solution {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (c <= i) {
                    dp[i] = Math.min(dp[i - c] + 1, dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    /* DFS Solution -- takes too much time
    int ct = Integer.MAX_VALUE;
    public void dfs(int amt, int c, int[] coins) {
        if (amt == 0) {
            ct = Math.min(c, ct);
            return;
        } 
        if (amt < 0) {
            return;
        }
        for (int x : coins) {
            dfs(amt - x, c + 1, coins);
        }
    }
    public int coinChange(int[] coins, int amount) {
        dfs(amount, 0, coins);
        return ct == Integer.MAX_VALUE ? -1 : ct;
    }*/
}