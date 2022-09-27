// Time: O(logn)
// Space: O(1)

class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        int result = 0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        while (ldividend >= ldivisor){
            int count = 0;
            while (ldividend >= (ldivisor << count)){
                count++;
            }
            count--;
            result += (Math.pow(2,count));
            ldividend -= (ldivisor << count);
        }
        if (dividend < 0 && divisor < 0) return result;
        if (dividend > 0 && divisor > 0) return result;
        return -result;
    }
}
