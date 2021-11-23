// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 && dividend != 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        int result = 0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        while(ldividend >= ldivisor){
            int shifts = 0;
            while(ldividend >= (ldivisor << shifts)){
                shifts++;
            }
            shifts--; // increased shifts one extra time
            result += 1 << shifts;
            ldividend -= (ldivisor << shifts);
        }
        if( (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ) 
            return result;
        return -result;
    }
}
