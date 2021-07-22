/*Running Time Complexity: O(log n)
Space Complexity: Constant
Successfully Run and Compiled on leetcode
*/
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend != 0 && divisor == 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int result = 0;
        while(ldividend >= ldivisor){
            int numshift = 0;
            while((ldivisor<<numshift)<=ldividend){
                numshift++;
            }
            numshift--;
            ldividend = ldividend - (ldivisor << numshift);
            result += (1<< numshift) ;
        }
        if(divisor>0 && dividend>0) return result;
        if(divisor<0 && dividend<0) return result;
        return -result;
    }
}