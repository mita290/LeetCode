class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        return helper(n, hm);
    }
    public int helper(int n, HashMap<Integer, Integer> hm) {
        if (n == 0 || n == 1) return 1;
        if (!hm.containsKey(n)) {
            hm.put(n, helper(n - 1, hm) + helper(n - 2, hm));
        }
        return hm.get(n);
    }
}