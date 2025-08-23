

/**
 * Divides two integers without using multiplication, division, or modulus operators.
 * Uses bit manipulation and repeated subtraction with shifting to speed up division.
 * Returns the quotient with proper sign handling.
 */
// Time Complexity: O(log²N), where N is the absolute value of the dividend
// Space Complexity: O(1), since only constant extra variables are used
public class Divide-Two-Integers {
    public int divide(int dividend, int divisor) {

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        int result = 0;

        while(ldividend >= ldivisor) {
            long current = ldivisor;
            int numShifts = 0; 

            while((current << 1) <= ldividend) {
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
