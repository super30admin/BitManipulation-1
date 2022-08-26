//****SINGLE NUMBER****
//Time complexity:o(n);
//Space complexity:o(1);
//Any doubts:N;
//Leetcode runnable: Y;

class Solution {
    public int singleNumber(int[] nums)
    {
        int result=nums[0];
        int bitmass=0;
        
        for(int num: nums)
        {
            bitmass^=num;
        }
        return bitmass;
    }
}

//****Divide two integers****
//Time complexity:o(n);
//Space complexity:o(1);
//Any doubts:N;
//Leetcode runnable: Y;


class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        
        long ldividend= (long)dividend;
        long ldivisor= (long)divisor;
        
        int result=0;
        
        while(ldividend>= ldivisor)
        {
            int shifts=0;
            while(ldividend>=(ldivisor<<shifts))
            {
                shifts++;
            }
            shifts--;
            result+= 1<< shifts;
            ldividend= ldividend - (ldivisor<<shifts);
        }
        return result;
        
    }
}
