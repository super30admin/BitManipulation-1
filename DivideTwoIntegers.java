// TC - log n to base 2
// SC - O(1)

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        int result = 0;
        while (ldividend >= ldivisor) {
            int shift = 0;
            while ((ldivisor << shift) <= ldividend) {
                shift++;
            }
            ldividend -= (ldivisor << --shift);
            result += 1 << shift;
        }
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0))
            return result;
        return -result;
    }
}
