class Solution {
    public boolean isAnagram(String s, String t) {
        // frequency counting
        // Time: O(n)
        // Space: O(1)
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }
        for (int x : freq) {
            if (x != 0) return false;
        }
        return true;

        // not optimal approach --> space complexity becomes O(n) and auxilliary space has to be considered
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1, arr2);
    }
}