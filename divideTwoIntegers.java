// Time Complexity : logarithamic
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// We use a left shift bitwise operator to multiply with 2
// we left shift the divisor till the value becomes greater than the dicidend, after that we take the difference between the divisor and the remaining value and then check if its greater than the divisor, if yes we try to do the left shift operation again. We finally add them up.
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int result = 0;

        long ldividend = Math.abs((long)dividend);  //10
        long ldivisor = Math.abs((long)divisor);    //3

        while (ldividend >= ldivisor) {
            int shifts = 0;
            // itteration 1                 itteration 2
            // 10 > 3    shifts=0           4 > 3   shifts=0
            // 10 > 6    shifts=1           4 > 6   shifts=1
            // 10 > 12   shifts=2;
            while (ldividend >= (ldivisor << shifts)) {
                shifts++;
            }
            shifts--;   //shifts=1;         shifts=0
            result += (1 << shifts);   //result = 1<<1 = 2          result += 1<<0 = 2+1 => 3
            ldividend = ldividend-(ldivisor << shifts);
        }

        if ((dividend>0 && divisor>0) || (dividend<0 && divisor<0)) {
            return result;
        }

        return -result;
    }
}