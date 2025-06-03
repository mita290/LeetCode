class Solution {
    public boolean[] isPrime(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }
    public int[] closestPrimes(int left, int right) {
        boolean[] sieve = isPrime(right);
        
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (sieve[i]) {
                al.add(i);
            }
        }
        if (al.size() < 2) return new int[]{-1, -1};
        int diff = Integer.MAX_VALUE;
        int[] arr = {-1, -1};
        for (int i = 1; i < al.size(); i++) {           
            if (al.get(i) - al.get(i - 1) < diff) {
                diff = al.get(i) - al.get(i - 1);
                arr[0] = al.get(i - 1);
                arr[1] = al.get(i);
            }            
        }
        return arr;
    }
}