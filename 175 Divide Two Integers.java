
// Time Complexity : O(log(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    //aesha
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int result = 0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        while(ldividend>=ldivisor)
        {
            int numshifts = 1;
            while(ldividend << numshifts <= ldivisor)
            {
                numshifts++;
            }
            numshifts--;

            result += 1<< numshifts;
            ldividend -= (ldivisor << numshifts);
        }
        if(dividend>0 && divisor>0) return result;
        if(dividend<0 && divisor<0) return result;
        if(dividend>0 || divisor>0) return -result;
return result;
    }
    
}