class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int n : nums) {
            hs.add(n);
        }
        return hs.size() != nums.length;

        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for (int n : nums) {
        //     if (hm.containsKey(n) && hm.get(n) > 0) {
        //         return true;
        //     } 
        //     hm.put(n, 1);
        // }
        // return false;
    }
}