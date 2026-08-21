class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // sliding window approach

        Queue<Integer> q = new LinkedList<>();
        int sum = 0, i = 0, len = Integer.MAX_VALUE;

        while (i < nums.length) {

            sum += nums[i];
            q.add(nums[i++]);

            while (sum >= target) {
                len = Math.min(len, q.size());
                sum -= q.poll();
            }
            
        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}