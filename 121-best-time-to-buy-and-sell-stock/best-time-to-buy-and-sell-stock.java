class Solution {
    public int maxProfit(int[] prices) {
        int p = 0;
        int st = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < st) {
                st = prices[i];
            } else if (prices[i] - st > p) {
                p = prices[i] - st;
            }
        }
        return p;
    }
}