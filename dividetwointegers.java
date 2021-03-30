/*
can make use of bit operations here to divide.

we will  shift the bits in order to divide the number

TC: O(n)
SC:O(1)

*/
class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend != 0 && divisor == 0)return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1)return Integer.MAX_VALUE;
        
        long ldividend = Math.abs ((long) dividend);
         long ldivisor = Math.abs ((long) divisor);
        
        int result = 0;
        
        while(ldividend >= ldivisor){
            int shifts = 0;
            while(ldividend >= (ldivisor << shifts)){
                System.out.println(ldivisor << shifts);
                shifts++;
                
            }
            shifts--;
            ldividend = ldividend - (ldivisor << shifts); //getting the remaining number
            result += 1 << shifts; // adding up the quotient in simple terms
        }
        
        if(dividend < 0 && divisor < 0)return result;
        if(dividend > 0 && divisor > 0)return result;
    
        return -result;    
    }
}