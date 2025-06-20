class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int total = 0, ct = 0;
        for (int n : nums) {
            total += n;
            if (hm.containsKey(total - k)) {
                ct += hm.get(total - k);
            }
            hm.put(total, hm.getOrDefault(total, 0) + 1);
        }
        return ct;
    }   
}

// Prefix Sum
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int[] arr = new int[n + 1];
//         arr[0] = 0;
//         for (int i = 1; i <= n; i++) {
//             arr[i] = arr[i - 1] + nums[i - 1];
//         }
//         int ct = 0;
//         for (int i = 1; i <= n; i++) {
//             ct += (arr[i] == k) ? 1 : 0;
//             for (int j = i + 1; j <= n; j++) {
//                 int x = arr[j] - arr[i];
//                 if (x == k) {
//                     ct++;
//                 }
//             }
//         }
//         return ct;
//     }
// }