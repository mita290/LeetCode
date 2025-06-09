class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] x = intervals[i];
            if (x[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], x[1]);
            } else {
                merged.add(prev);
                prev = x;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]); 
    }
}