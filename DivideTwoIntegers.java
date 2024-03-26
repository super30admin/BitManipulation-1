/*
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(logn)
* 
* Space Complexity: O(1)
* 
*/
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = false;

        if (divisor > 0 && dividend < 0 || dividend > 0 && divisor < 0) {
            negative = true;
        }

        long longDivisor = Math.abs((long) divisor);

        long longDividend = Math.abs((long) dividend);

        if (longDividend < longDivisor) {
            return 0;
        }

        long result = 0l;

        while (longDividend >= longDivisor) {
            int shifts = 0;

            while (longDividend >= (longDivisor << shifts)) {
                shifts++;
            }

            shifts--;

            longDividend = (longDividend - (longDivisor << shifts));

            result += (1 << shifts);
        }

        if (negative) {
            return (int) -result;
        }

        return (int) result;
    }
}