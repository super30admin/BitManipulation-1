package org.example;
// Time Complexity : O(log n + log k) -> log k is too small and n is the number of shifts
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int result = 0;
        while(ldividend >= ldivisor){
            int numShifts = 1;
            while((ldivisor << numShifts) <= ldividend){
                numShifts++;
            }
            numShifts--;
            ldividend = ldividend -(ldivisor << numShifts);
            result += 1<<numShifts;
        }

        if(dividend<0 && divisor>0) return -result;
        if(dividend>0 && divisor<0) return -result;

        return result;
    }
}
