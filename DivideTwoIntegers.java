//https://leetcode.com/problems/divide-two-integers
//TC : O(log n)
//SC : O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1 || divisor == -1){
            int q = dividend * divisor;
            if(q > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return dividend * divisor;
        }
        int result = 0;
        long ldivisor = Math.abs((long)divisor);
        long ldividend = Math.abs((long)dividend);
        while(ldivisor <= ldividend){
            int shifts = 0;
            while(ldividend >= (ldivisor << shifts)){
                shifts++;
            }
            shifts--;
            result += (1 << shifts);
            ldividend -= ldivisor << shifts;
        }
        if((divisor < 0 && dividend > 0) || (divisor > 0 && dividend < 0))
            return -result;
        return result;
        
    }
}
