//Time O(n)
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0)
        {
            return Integer.MAX_VALUE;
        }
        if(divisor==-1 && dividend==Integer.MIN_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        long ldividend=Math.abs((long)dividend);
        long ldivisor=Math.abs((long)divisor);
        int output=0;
        while(ldividend>=ldivisor)
        {
        int numOfShifts=0;
        while(ldividend>=(ldivisor<<numOfShifts))
        {
            numOfShifts++;
        }
        numOfShifts--;
        output+=1<<numOfShifts;
        ldividend=ldividend-(ldivisor<<numOfShifts);
        }
        if(divisor>0 && dividend>0 || divisor<0 && dividend<0)
        {
            return output;
        }
        return output*-1;

    }
}