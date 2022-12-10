//Time - O(n)
//Space - O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor ==0) return Integer.MIN_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        int quotient=0;
        while(ldividend >= ldivisor){
            int count=0;
            while(ldividend >= (ldivisor << count)){
                count++;
            }
            count--;
            quotient+= 1<<count;
            ldividend = ldividend - (ldivisor << count);
        }
        if(dividend < 0 && divisor <0) return quotient;
        if(dividend >0 && divisor >0) return quotient;
        return -quotient;
    }
}