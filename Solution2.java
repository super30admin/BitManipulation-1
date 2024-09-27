//BitManipulation-1 

//Problem1 

//Divide Two Integers(https://leetcode.com/problems/divide-two-integers/)

// Brute force
// Time - O(n)
// Space - O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        //edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = 0;
        if(dividend < 0){
            dividend *= -1;
            sign += 1;
        }
        
        if(divisor < 0){
            divisor *= -1;
            sign += 1;
        }
        
        
   
        int quotient = 0;
        while(dividend - divisor >= 0){
            quotient++;
            dividend -= divisor;
        }
        
        
        return sign % 2 == 0 ? quotient :  -quotient; 
        
    }
}

// Optimized - Bit Manipulation
// Time - O(logn)
// Space - O(1)
class Solution {
    public int divide(int dividend, int divisor) {
        //edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = 0;
        long _divisor = divisor;
        long _dividend = dividend;
        
        if(_dividend < 0){
            _dividend *= -1;
            sign += 1;
        }
       
        
        if(_divisor < 0){
            _divisor *= -1;
            sign += 1;
        }       
         
        int res = 0; 
        while(_dividend >= _divisor){
           int quotient = 0;
            while(_dividend >= (_divisor << quotient) ){
                quotient++;
            }
            
            quotient--;
        
            _dividend = _dividend - (_divisor << quotient);
            //res += Math.pow(2, quotient);
            res += 1 << quotient;
           
           
        }
       
        
        return sign != 1 ? res : -res;

    }
}