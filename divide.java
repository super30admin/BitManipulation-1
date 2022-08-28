//Time: O(N) | Space: O(1)

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int result = 0;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        while (ldividend >= ldivisor) {
            int count = 0;
                        /*
            0 ->5*1 = 5
            1 ->5*2 = 10
            2 ->5*4 = 20
            3 ->5*3 = 40
            4 ->5*16 = 80
            */
            while (ldividend >= (ldivisor << count)) {
                count++;
            }
            count--;
            result += (1 << count); // it is nothing but 2^count
            ldividend -= ldivisor << count;
        }
        if (divisor > 0 && dividend > 0 || divisor < 0 && dividend < 0) return result;
        return -result;
    }
} 