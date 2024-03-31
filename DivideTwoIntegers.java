public class DivideTwoIntegers {
    // TC: O(log divisor)
    // SC: O(1)
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        int res = 0;
        boolean isPositive = false;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend > 0 && divisor > 0) {
            isPositive = true;
        }
        if (dividend < 0 && divisor < 0) {
            isPositive = true;
        }
        long lDividend = Math.abs((long)dividend);
        long lDivisor = Math.abs((long)divisor);
        while (lDividend >= lDivisor) {
            int shifts = 0;
            while (lDividend >= (lDivisor << shifts)) {
                shifts++;
            }
            shifts--;
            lDividend = lDividend - (lDivisor << shifts);
            res += (int)Math.pow(2, shifts);
        }
        return isPositive ? res : -res;
    }
}
