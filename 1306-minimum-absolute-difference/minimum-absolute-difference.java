class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int x = Math.abs(arr[i] - arr[i + 1]);
            if (x < diff) {
                diff = x;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (x == diff) {                
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
}