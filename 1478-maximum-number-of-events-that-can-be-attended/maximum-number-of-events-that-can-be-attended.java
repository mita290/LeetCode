class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0, ct = 0, n = events.length;
        int last = 0;
        for (int[] e : events) {
            last = Math.max(last, e[1]);
        }
        for (int day = 1; day <= last; day++) {
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]);
                i++;
            }
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                ct++;
            }
            if (i == n && pq.isEmpty()) {
                break;
            }
        }
        return ct;
    }
}