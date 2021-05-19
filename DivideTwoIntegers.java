class Solution {
    public int divide(int dividend, int divisor) {
        //handling overflows
        if(divisor == 0){
            return Integer.MAX_VALUE;
        }   
        else if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        int output = 0;
        
        while(ldividend >= ldivisor){
            int shifts = 0;
            
            while(ldividend >= (ldivisor << shifts)){
                shifts++;
            }
            
            shifts--;
            output += 1<<shifts;
            
            ldividend = ldividend - (ldivisor << shifts);
        }
        
        if(dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0){
            return output;
        }
        
        return -1*output;
    }
}
//Time Complexity: O(log(dividend))
//Space Complexity: O(1)