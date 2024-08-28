public class DivideTwoIntegers {
    /**
     * Leftshit
     * Rightshift
     *
     *
     *
     */
    public int divide(int dividend, int divisor) {
        // if we devide anything by 0 we return infinity
        if (dividend != 0 && divisor == 0) {
            return Integer.MAX_VALUE;
        }
        // if we devide very samll value with small va;ue we might get very large number
        if ((dividend == Integer.MIN_VALUE) && (divisor == -1)){
            return Integer.MAX_VALUE;
        }
        // Since we are repeatedly leftshifting we can get very large number so using
        // long data type.
        // division process remain same so we will add sign later if needed
        long lDividend = Math.abs((long) (dividend));
        long lDivisor = Math.abs((long) (divisor));
        long result = 0;
        while (lDividend >= lDivisor) {
            // until dividend is greater left shift devisor.
            int shifts = 0;
            while (lDividend >= (lDivisor << shifts)) {
                //lDivisor = lDivisor << shifts;
                shifts++;
            }
            shifts--;
            result = result + (1 << shifts);
            lDividend = lDividend - (lDivisor << shifts);

        }
        if (dividend < 0 && divisor > 0) {
            return -((int) result);
        }
        if (dividend > 0 && divisor < 0) {
            return -((int) result);
        }
        return (int) result;
    }
}
