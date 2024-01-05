// Time Complexity : O(logn*logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class DivideTwoIntegers {
    class Solution {
        public int divide(int dividend, int divisor) {
        /*Bit manipulation
        to multiply: left shift( << )
        left shift until dividend > divisor
        subtract dividend by shifing divisor*/

            if(divisor==-1 && dividend == Integer.MIN_VALUE)
                return Integer.MAX_VALUE;

            boolean isNeg = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

            long lDividend = Math.abs((long)dividend);
            long lDivisor = Math.abs((long)divisor);

            int result = 0;

            while(lDividend >= lDivisor){
                int leftShift = 0;

                while(lDividend >= (lDivisor << leftShift)){
                    leftShift++;
                }
                leftShift--;

                result += 1 << (leftShift);
                lDividend -= (lDivisor << (leftShift));
            }

            return isNeg ? -result : result;
        }
    }
}
