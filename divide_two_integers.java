// Time Complexity : O(logn) 
// Space Complexity : O(1) constant space
class Solution {
    public int divide(int dividend, int divisor) {
        
        // Edge cases
        if (dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;
        }
        
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        
        // find the nearest multiple of divisor using the left shift
        long newDividend  = Math.abs((long) dividend);
        long newDivisor = Math.abs((long) divisor);
        
        int quotient = 0;
        
        // Modify the dividend till we get the larger multiple of 3
        while (newDividend >= newDivisor){
            
            int shifts = 0;
            long temp = newDivisor;
            
            // use the left shift and update the dividend 
            
            
            while (newDividend >= temp){
                
                // Do left shift and find the nearest temp
                temp = temp << 1;
                
                shifts++;
                
            }
            
            // decrease the shift as the dividend will exceed the temp
            shifts--;
            
            // Add the result with (shifts * shifts)
            quotient += 1 << shifts;
            
            // update the dividend 
            newDividend =  newDividend - (newDivisor << shifts);
            
        }
        
        // negative sign
        if (dividend > 0 && divisor < 0 || dividend <0 && divisor > 0){
            return -quotient;
        }
        
        return quotient;
    }
}