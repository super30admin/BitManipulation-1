// Time Complexity : O(log n) where n is the divisor
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Understanding Shifts concept
/* Your code here along with comments explaining your approach: Do arithematic shifts till dividend >= divisor. Increment the number of times, you
are doing arithematic shifts. If the number exceeds dividend, hold back and  check if the current dividend is greater than the divisor. If yes,
repeat the same process again till you are finish with a scenario where divisor exceeds the dividend. If both the numbers are opposite, return
-result else return result only.
*/
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || dividend == 0) return 0;
        if(divisor == -1 && dividend == Integer.MIN_VALUE)                                                          // Edge case
            return Integer.MAX_VALUE;
        long dividendL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);                                                            // Make both the numbers positive
        int result = 0;
        while(dividendL >= divisorL){
            int shifts =0;
            while(dividendL >= (divisorL << shifts)){                                                       // Whilte dividend > divisor, do arithmatic shifts
                shifts++;                                                                               // Count the number of shifts = quotient
            }
           shifts--;                                                                                    // Overshoot
            dividendL =dividendL - (divisorL << shifts);                                            // Still dividend is greater than divisor
            result += 1 << shifts;
        }
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) return result;                           // Both have same sign
        else return -result;                                                                            // Both are of different sign
    }
}