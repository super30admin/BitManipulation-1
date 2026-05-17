// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Take absolute values of both the numbers and convert to long to handle the overflow. Now, use left bit shifts to
subtract the longest possible multiple of divisor each time. Keep on adding the number of shifts to the
result variable to get the final quotient.
 */
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if(divisor == 1)
            return dividend;
        int result = 0;

        long lDividend = Math.abs(Long.valueOf(dividend));
        long lDivisor = Math.abs(Long.valueOf(divisor));

        while(lDividend >= lDivisor) {
            int numShifts = 1;
            while((lDivisor << numShifts) <= lDividend) {
                numShifts++;
            }
            numShifts--;
            result += 1 << numShifts;
            lDividend = lDividend - (lDivisor << numShifts);
        }
        if(dividend < 1 && divisor < 1)
            return result;
        if(dividend > 1 && divisor > 1)
            return result;
        return -result;
    }
}