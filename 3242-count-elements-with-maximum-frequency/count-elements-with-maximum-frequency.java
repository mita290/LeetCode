class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0; 
        for (int x : freq.values()) {
            max = Math.max(x, max);
        }
        int ct = 0;
        for (int x : freq.values()) {
            if (x == max) {
                ct++;
            }
        }
        return ct * max;
    }
}