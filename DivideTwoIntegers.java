// Time Complexity : O(log n ^ 2 ) Outer loop is O(log (dividend)) and inner loop is O(log(divisor))
// Space Complexity : O(1) constant space

public class DivideTwoIntegers {
    public int divide( int dividend, int divisor){

        // handle edge case of overflow
        if( dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        // determine the sign of the result using XOR operation
        boolean isNegative = ( dividend < 0) ^ (divisor<0);

        // get Absolute Values of both dividend and divisor

        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);
        int quotient =0;

        // Subtract the multiples of divisor using left shift
        while( absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;

            // double the divisor until it exceeds the dividend by doing left shift
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // subtract the largest multiple of divisor

            absDividend = absDividend - tempDivisor;
            quotient = quotient + multiple;

            // apply the sign
        }
            return isNegative ? -quotient : quotient;
    }

        public static void main (String [] args){
        DivideTwoIntegers solution = new DivideTwoIntegers();
        int dividend1 =  49;
        int divisor1 = 7;

        int result1 = solution.divide(dividend1, divisor1);
        System.out.println(result1);

        int dividend2=  30;
        int divisor2 = -7;

        int result2 = solution.divide(dividend2, divisor2);
        System.out.println(result2);


        }


}
