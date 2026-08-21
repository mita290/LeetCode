class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        LinkedHashMap<Integer, ArrayList<Integer>> hm = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            
            if (hm.containsKey(nums[i])) {

                hm.get(nums[i]).add(i);
                for (int j = 0; j < hm.get(nums[i]).size(); j++) {
                    if (hm.get(nums[i]).get(j) != i && Math.abs(hm.get(nums[i]).get(j) - i) <= k) {
                        return true;
                    }
                }
                
            } else {
                hm.put(nums[i], new ArrayList<Integer>(Arrays.asList(i)));
            }
        }
        return false;
    }
}