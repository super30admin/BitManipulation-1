// Problem 29. Divide Two Integers
// Time Complexity : O(log(abs(dividend)))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        int result = 0;
        while (ldividend >= ldivisor) {
            int shifts = 1;
            while (ldividend >= (ldivisor << shifts)) {
                shifts++;
            }
            shifts--;
            result += 1 << shifts;
            ldividend -= ldivisor << shifts;
        }
        if ((dividend < 0) ^ (divisor < 0)) {
            return -result;
        }
        return result;
    }
}