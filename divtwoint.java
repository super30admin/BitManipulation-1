//Time Complexity: O(log N) where N = dividend
//Space Complexity: O(1)

//Guard overflow (INT_MIN/−1), convert to positive longs via abs.
//While ldividend >= ldivisor, left-shift ldivisor to find the largest power-of-two multiple ≤ remaining dividend, add that power to result.
//Subtract that multiple from the remaining dividend and repeat; finally apply the correct sign to result.

class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
    
        int result = 0;

        while(ldividend >= ldivisor){
            long current = ldivisor;
            int numShifts = 0;

            while((current << 1) <= ldividend){
                numShifts++;
                current = current << 1;
            }

            result += 1 << numShifts;
            ldividend = ldividend - current;
        }

        if(dividend < 0 && divisor < 0) return result;
        if(dividend < 0 || divisor < 0) return -result;
        return result;
    }
}
