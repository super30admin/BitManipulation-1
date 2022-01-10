// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 && dividend != 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        // 25
        // 4 >> 8 >> 16 >> 32
        int result = 0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        while(ldividend >= ldivisor) { // 9 4 >> 8
            int shifts = 0;
            while(ldividend >= (ldivisor << shifts)) { // 9 4 >> 8 >> 16
                shifts++;
            }
            shifts--;
            result += 1 << shifts; // 4 + 2 = 6
            ldividend = ldividend - (ldivisor << shifts); // 25 - 16 = 9 , 9 - 8 = 1
        }
        if(dividend > 0 && divisor > 0) return result;
        if(dividend < 0 && divisor < 0) return result;
        return -result;
    }
}