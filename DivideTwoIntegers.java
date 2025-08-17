// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : We use left shift operator to multiply divisor by 2. Repeat it iteratively until dividend >divisor
class Solution {
    public int divide(int dividend, int divisor) {
        long res=0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        if(dividend == Integer.MIN_VALUE && divisor ==-1){
            return Integer.MAX_VALUE;
        }
        while(ldividend>=ldivisor){
            int shift = 0;
            while((ldivisor<<shift)<=ldividend){
                shift++;
            }
            shift = shift-1;
            res += 1 << shift;
            ldividend = ldividend - (ldivisor<<shift);
        }
        System.out.println(res);
        if((dividend<0 && divisor<0)|| (divisor>0 && dividend>0))
        {
            System.out.println("In here");
            return (int)res;
        }
        return (int)(-res);
    }
}
