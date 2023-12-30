// Time Complexity : O(logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int divide(int dividends, int divisors) {
        if(dividends == Integer.MIN_VALUE && divisors == -1)
            return Integer.MAX_VALUE;
        int res = 0;

        long dividend = Math.abs((long) dividends);
        long divisor = Math.abs((long) divisors);
        while(dividend >= divisor){
            int cnt = 1;
            while(dividend > (divisor << cnt)){
                cnt++;
            }
            cnt--;
            dividend -= (divisor << cnt);
            res += 1 << cnt;
        }
        if(dividends > 0 && divisors > 0)
            return res;
        if(dividends < 0 && divisors < 0)
            return res;
        return -res;
    }
}