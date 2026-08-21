class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> lists = new ArrayList<>();

        // using two pointer method

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            // to skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = n - 1;
            
            while (left < right) {
                
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    lists.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right --;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return lists;

        /* Doesn't handle duplicate triplets
        for (int i = 0; i < n; i++) {
            
            HashMap<Integer, Integer> hm = new HashMap<>();
            int target = -nums[i];

            for (int j = i + 1; j < n; j++) {

                int x = target - nums[j];

                if (hm.containsKey(x)) {

                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(-target);
                    al.add(nums[j]);
                    al.add(x);
                    lists.add(al);          
                    
                }
                hm.put(nums[j], j);
            }
        }
        return lists;*/
    }
}