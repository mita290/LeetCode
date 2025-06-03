class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 0);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && t[i] > t[st.peek()]) {
                int ind = st.pop();
                arr[ind] = i - ind;
            }
            st.push(i);
        }
        return arr;
        // O(n^2) TC --> all the test cases will not pass
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if  (t[j] > t[i]) {
        //             arr[i] = j - i;
        //             break;
        //         }
        //     }
        // }
    }
}