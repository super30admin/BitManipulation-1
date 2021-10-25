//TC: O(1), because maximum number of times leftshift can be done is 32
//SC:O(1)
//Running on leetcode: yes
class Solution {
    public int divide(int dividend, int divisor) {
        //base case
        if(dividend != 0 && divisor ==0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        //while multiplication by 2 its possible to go out of range
        //since operands can be +ve and -ve , take absolute value
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int result = 0;
        
        while(ldividend >= ldivisor) {
            int numShifts = 0;
            while(ldividend >= ldivisor << numShifts) {
                numShifts++;
            }
            numShifts--;
            result = result + (1 << numShifts);
            ldividend = ldividend - (ldivisor << numShifts);
        }
        if(divisor > 0 && dividend > 0) {
            return result;
        }
        if(divisor < 0 && dividend < 0) {
            return result;
        }
        return -result;
    }
}
