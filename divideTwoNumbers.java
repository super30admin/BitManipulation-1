/*
Problem: https://leetcode.com/problems/divide-two-integers/
*/
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend != 0 && divisor == 0) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; 
        
        // Convert it to long because left shift may result in a value that might not fit in int.
        // Take abs now and deal with -ve sign in the end
        long lDivisor = Math.abs((long)divisor);
        long lDividend = Math.abs((long)dividend);
        int result = 0;
        
        while (lDividend >= lDivisor) {
            int shifts = 0;
            
            while (lDividend >= (lDivisor << shifts)) {
                ++shifts;
            }
            
            // shifts would have become one greater, so decrement
            --shifts;
            result = result + (1 << shifts);
            lDividend = lDividend - (lDivisor << shifts);
        }
        
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
            return -result;
        
        return result;
    }
}