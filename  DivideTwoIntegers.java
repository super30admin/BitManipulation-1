// Time Complexity: O(logn)
// Space Complexity: O(1)
public class  DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        int result = 0;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        while(ldividend >= ldivisor)
        {
            int shifts = 0;
            while(ldividend >= (ldivisor << shifts)) // ldivisor << shifts is logn
            {
                shifts++;
            }
            // last shift made the condition false so reset to last valid 
            shifts--;
            result = result + (1 << shifts);
            ldividend = ldividend - (ldivisor << shifts);
        }
        
        if(divisor > 0 && dividend > 0)
        {
            return result;
        }
        
         if(divisor < 0 && dividend < 0)
        {
            return result;
        }
        
        return -result;
    }
}
