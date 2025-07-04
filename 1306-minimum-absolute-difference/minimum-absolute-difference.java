class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int x = Math.abs(arr[i] - arr[i + 1]);
            if (x < diff) {
                diff = x;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            if (Math.abs(arr[i] - arr[i + 1]) == diff) {
                al.add(arr[i]);
                al.add(arr[i + 1]);
                res.add(al);
            }
        }
        return res;
    }
}