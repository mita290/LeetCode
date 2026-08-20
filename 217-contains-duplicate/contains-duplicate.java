class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            if (hm.containsKey(n) && hm.get(n) > 0) {
                return true;
            } 
            hm.put(n, 1);
        }
        return false;
    }
}