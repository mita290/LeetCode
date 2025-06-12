class Solution {
    public int change(int amount, int[] coins) {
        // Memoization table: Map of (i, x) -> number of ways
        Map<String, Integer> memo = new HashMap<>();
        return numWays(0, amount, coins, memo);
    }

    private int numWays(int i, int x, int[] coins, Map<String, Integer> memo) {
        String key = i + "," + x;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // If we've gone through all coins
        if (i == coins.length) {
            return x == 0 ? 1 : 0;
        }

        int take = 0;
        if (x >= coins[i]) {
            take = numWays(i, x - coins[i], coins, memo); // use coin[i]
        }

        int skip = numWays(i + 1, x, coins, memo); // move to next coin

        int totalWays = take + skip;
        memo.put(key, totalWays);
        return totalWays;
    }
}
