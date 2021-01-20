
// Time Complexity : O(1) 2^32 max number i.e. max shifts
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : nopes


class SolutionOne {
    public int divide(int dividend, int divisor)
    {

        if(divisor == 0 && dividend >= 0)
            return Integer.MAX_VALUE;

        if(divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;


        long ldividend = Math.abs((long)dividend);

        long ldivisor = Math.abs((long)divisor);

        int result = 0;


        while(ldividend >= ldivisor)
        {
            int numShifts = 0;

            while(ldividend>=(ldivisor<<numShifts))
            {
                numShifts++;
            }

            numShifts--;

            result +=1 << numShifts;

            ldividend -= ldivisor<<numShifts;
        }

        if(dividend>0 && divisor>0)
            return result;

        if(dividend<0 && divisor<0)
            return result;

        return -result;
    }
}