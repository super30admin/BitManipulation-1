// Approach: Adding Powers of Two with Bit-Shifting.
// Use left shift to get the doubles of divisor. Get the count of shifts to get a no.
// just less than the dividend. Then calculate the result
// Time: O(logn)
// Space: O(1)
class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // edge cases
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int result = 0;

        while (ldividend >= ldivisor) {
            int shifts = 0;         // left shift denoted by <<
            while (ldividend >= (ldivisor << shifts)) {
                shifts++;
            }
            shifts--;   // reduce 1
            result += (1 << shifts);
            ldividend = ldividend - (ldivisor << shifts);
        }
        if (dividend > 0 && divisor > 0) return result;
        if (dividend < 0 && divisor < 0) return result;
        return -result;
    }
}