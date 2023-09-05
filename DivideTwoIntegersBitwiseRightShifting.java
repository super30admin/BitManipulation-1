import java.util.Scanner;

public class DivideTwoIntegersBitwiseRightShifting {

        // Bitwise Right Shift - Time O(log(n)) and Space O(1)

        public int divide(int dividend, int divisor) {

            // convert to longs
            long dividendL = Math.abs((long)dividend);
            long divisorL = Math.abs((long)divisor);

            // edge case - one
            if(dividend == Integer.MIN_VALUE && divisor == -1) {

                return Integer.MAX_VALUE;
            }

            // edge case - two
            if(divisor == 0) {

                return Integer.MAX_VALUE;
            }

            int quotient = 0;

            // loop until divisor is not more than dividend
            while(dividendL >= divisorL) {

                // make shifts zero at the beginning of outer loop
                int shifts = 0;

                // inner loop comparing right shifted divisor with dividend
                while(dividendL >= (divisorL << shifts)) {

                    // increment shifts for every right shift
                    shifts++;
                }

                // the last shift breaks loop, so decrement by one
                shifts--;

                // update dividend
                dividendL = dividendL - (divisorL << shifts);

                // 2^shifts
                // update quotient
                quotient += (1 << shifts);
            }

            // if both dividend and divisor are either positive or negative, quotient is positive
            if((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {

                return quotient;
            }

            // if one of dividend or divisor is negative, quotient is negative
            return -quotient;
        }

        public static void main(String[] args) {

            DivideTwoIntegersBitwiseRightShifting obj = new DivideTwoIntegersBitwiseRightShifting();

            Scanner scanner = new Scanner(System.in);

            System.out.println("dividend: ");
            int dividend = scanner.nextInt();

            System.out.println("divisor: ");
            int divisor = scanner.nextInt();

            int answer = obj.divide(dividend, divisor);

            System.out.println("divide two integers without using multiplication, " +
                    "division, and mod operator: " + answer);

        }

}

/*
Time Complexity = O(log(n))

n = absolute value of dividend

Space Complexity = O(1)
*/