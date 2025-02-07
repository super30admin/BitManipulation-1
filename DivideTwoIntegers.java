// Approach : Using the intution of left shift and right shift.. Left shift is multiplying by 2 and right shift is dividing by 2
// Time : O(logn) // Increasing the numbers by 2
// Space : O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case
        if(dividend == 0) return 0;
        if(divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        int result =0; // quotient
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        while(ldividend >=ldivisor){
            int numShifts = 1;
            while(ldivisor << numShifts <= ldividend){
                numShifts++;
            }
            numShifts --; // reduce the extra shift
            result += 1 << numShifts ; // This is equal to 2 ^ numShifts;
            ldividend = ldividend - (ldivisor << numShifts);
        }


        if(dividend >0 && divisor < 0 ) return -result;
        if(dividend < 0 && divisor >0) return -result;

        return result; 
    }
}