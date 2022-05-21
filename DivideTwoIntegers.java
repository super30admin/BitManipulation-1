// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// If both divisor and dividend are same we will have +ve output else -ve
// We will generate the sign initially and store it and sove for +ve outcome
// We will get the closer no. to divxidend which is divisible by divisor
// By multiplying it by two each time and checking if its less than dividend
// We will subtract that no. and keep repeating the process
// Simultaneously we will maintain the quotient var and keep adding the quotient for each process
// Finally we will multiply the quotient with the sign and return it.
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int flag = (dividend < 0 ^ divisor < 0)? -1 : 1;
        long newdividend = Math.abs((long) (dividend));
        long newdivisor = Math.abs((long) (divisor));
        int steps = 0;
        int quotient = 0;
        while(newdividend >= newdivisor){
            long temp = newdivisor;
            while(temp <= newdividend){
                temp = temp << 1;
                steps++;
            }
            newdividend = newdividend - (temp >> 1);
            quotient += (1<<steps-1);
            steps=0;
        }
        return quotient * flag;
    }
}