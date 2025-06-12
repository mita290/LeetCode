class Solution {
    public int change(int amount, int[] coins) {
        Map<String, Integer> memo = new HashMap<>();
        return count(0, amount, coins, memo);
    }
    public int count(int i, int x, int[] coins, Map<String, Integer> memo) {
        String key = i + "," + x;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (i == coins.length) {
            return (x == 0) ? 1 : 0;
        }
        int take = 0;
        if (x >= coins[i]) {
            take = count(i, x - coins[i], coins, memo);
        }
        int skip = count(i + 1, x, coins, memo);
        int total = take + skip;
        memo.put(key, total);
        return total;
    }
}