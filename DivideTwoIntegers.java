// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend != 0 && divisor == 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int result = 0;
        while(ldividend >= ldivisor) {
            int shift = 0;
            while(ldividend >= ldivisor << shift) {
                shift++;
            }
            shift--;
            result += 1 << shift;
            ldividend = ldividend - (ldivisor << shift);
        }
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) return -result;
        return result;
    }
}