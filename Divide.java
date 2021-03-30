// Time Complexity : The time complexity is O(logn) where n is the divisor
// Space Complexity : Te space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach


class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend != 0 && divisor == 0 ) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1 ) return Integer.MAX_VALUE;

        int res = 0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        while(ldividend >= ldivisor){
            int numShifts = 0;

            // left shift which represents multiplication
            while(ldividend >= (ldivisor << numShifts)){
                numShifts++;
            }
            numShifts--;
            // reduce the dividend until its less than the divisor
            ldividend -= ldivisor << numShifts;

            // get the value by doing 2 power number of bit shifts
            res += (1 << numShifts);
        }

        if(dividend < 0 && divisor < 0) return res;
        if(dividend > 0 && divisor > 0) return res;
        return -res;

    }
}