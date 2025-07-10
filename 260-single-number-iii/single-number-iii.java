class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }

        // getting last set bit
        res &= -res;
        
        int[] arr = new int[2];

        for (int n : nums) {
            // if bit is not set --> first group
            
            if ((n & res) == 0) {
                arr[0] ^= n;
            } else { // otherwise in second group
                arr[1] ^= n;
            }
        }
        return arr;
    }
}