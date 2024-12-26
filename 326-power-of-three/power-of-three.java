class Solution {
    public boolean isPowerOfThree(int n) {
        // using recursion
        // if (n <= 0) {
        //     return false;
        // } else if (n == 1) {
        //     return true;
        // } 
        // return n % 3 == 0 && isPowerOfThree(n / 3);

        //mathematical property
        // 1162261467 is 3^19,  3^20 is bigger than int  
        return (n > 0 && Math.pow(3, 19) % n == 0);



    }
}