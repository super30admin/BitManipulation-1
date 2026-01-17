
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

/*
Approach
we are using bit shifts to divide
we divisor becomes greater then dividend we resuce the shifts and
subtract from dividend do this until we have fividend smaller then divsior
*/
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long ldividend = Math.abs((long) (dividend));
        long ldivisor = Math.abs((long) (divisor));
        int result = 0;
        while (ldividend >= ldivisor) {
            int shifts = 0;
            while (ldividend >= (ldivisor << shifts)) {
                shifts++;
            }
            shifts--;
            result += 1 << shifts;
            ldividend = ldividend - (ldivisor << shifts);
        }
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            return result;
        }
        return -result;
    }
}