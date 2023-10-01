//When we do a left shift on any number, the result is the double of its value. Here we will keep left shifting the divisor until the value exceeds the dividend. 2 to the power of number of times, the shift operation is performed is the final result. If the difference between the value received and the dividend is greater than the divisor, it means there is still scope of division to be completed. The difference becomes the new dividend and we follow the same method here as well. Find the number of shift operations done and add this result with the previous one. TC: O(log n)

class Solution {
    public int divide(int dividend, int divisor) 
    {
        if (divisor==0) return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        long ldividend=Math.abs((long)dividend);
        long ldivisor=Math.abs((long)divisor);
        int result=0;
        while(ldividend>=ldivisor)
        {
            int numShift=0;

            while(ldivisor<<numShift <= ldividend)   //keep doing left shift until it exceeds the dividend
            {
                numShift++;
            }
            numShift--; //take one step back
            result+=(1<<numShift);  //2 to the power of numshift
            ldividend=ldividend-(ldivisor<<numShift); // difference becomes the new dividend
        }
        if((dividend<0 && divisor < 0) || (dividend>0 && divisor > 0)) return result;
        return -result;
        
    }
}