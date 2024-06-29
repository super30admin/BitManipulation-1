class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend != 0 && divisor == 0) return Integer.MAX_VALUE;

        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int result = 0;

        long l_dividend = Math.abs((long)dividend);
        long l_divisor = Math.abs((long)divisor);

        while(l_dividend >= l_divisor)
        {
            int shifts = 0;

            while(l_dividend >= (l_divisor << shifts)) ++shifts;

            --shifts;

            // If shifts is 3 then we need to need to do 2 ^ 3, 1 << shifts will do the same for us
            result = result + (1 << shifts);

            l_dividend = l_dividend - (l_divisor << shifts);
        }

        if(dividend > 0 && divisor < 0) return -result;

        if(dividend < 0 && divisor > 0) return -result;

        return result;
    }
}
