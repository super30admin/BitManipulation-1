// Time Complexity : O(log(n))
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public int divide(int dividend, int divisor) {
        //edge case
        if(dividend == -2147483648 && divisor == -1) return 2147483647;
        //Taking long to handle -2^31
        long Dividend = Math.abs((long)dividend);
        long Divisor = Math.abs((long)divisor);
        long div = Divisor;
        int result = 0;
        //left shift till divisor is greater than dividend
        while(Divisor <= Dividend){
            int count = 0;
            while(Divisor <= Dividend){
                Divisor = Divisor << 1;
                count++;
            }
            result =  result + (1 << (count-1));
            Divisor = div << (count-1);
            Dividend -= Divisor;
            Divisor = div;
        }
        //Handle negative numbers
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) return result;
        else return -result;
    }
}