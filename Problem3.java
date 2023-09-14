public class Problem3 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long ldivisor = Math.abs((long) divisor);
        long ldividend = Math.abs((long) dividend);
        int res = 0;
        while (ldividend >= ldivisor) {
            int shifts = 0;
            while (ldividend >= (ldivisor << shifts)) {
                shifts++;
            }
            shifts--;
            res += 1 << shifts;
            ldividend = ldividend - (ldivisor << shifts);
        }
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
            return res;
        return -res;
    }
}