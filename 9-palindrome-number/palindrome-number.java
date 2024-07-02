class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else{
            int n = 0;
            int m = x;
            while(m > 0){
                n = (10 * n) + (m % 10);
                m /= 10;
            }
            return n == x;
        }
    }
}