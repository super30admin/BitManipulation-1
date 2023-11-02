// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach:
// 1. We will use bit manipulation to solve this problem.
// 2. We will use long to store the dividend and divisor as we will be using left shift operator.
// 3. We will use a while loop to check if dividend is greater than divisor.
// 4. Inside while loop, we will use another while loop to check if dividend is greater than divisor left shifted by 1.
// 5. If it is greater, we will left shift the divisor by 1 and increment the shifts count.
// 6. Once we are out of the inner while loop, we will subtract the dividend by divisor left shifted by shifts count.
// 7. We will add 2 power shifts count to the result.
// 8. We will return the result according to the signs of dividend and divisor.


public class DivideTwoIntegers {

    public static void main(String[] args) {
        DivideTwoIntegers obj = new DivideTwoIntegers();
        System.out.println(obj.divide(10, 3)); // expected output: 3
        System.out.println(obj.divide(7, -3)); // expected output: -2
    }

    public int divide(int dividend, int divisor) {
        if( divisor == 0 ) {
            return Integer.MAX_VALUE;
        }
        if( dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if( divisor == 1) {
            return dividend;
        }
        int result = 0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        // int shifts = 0;
        while( ldividend >= ldivisor) {
            int shifts = 0;
            while( ldividend >= (ldivisor<<shifts) ) { // till its greater do lift shift
                shifts++;
            }
            shifts--;
            ldividend = ldividend - (ldivisor<<shifts); // updateing it new dividend
            result = result + (int)Math.pow(2,shifts); // add 2 power shifts count
        }

        //returniing according to the signs
        if( (divisor > 0 && dividend >= 0) || (divisor < 0 && dividend < 0) ) {
            return result;
        }
        return -1*result;
    }
}