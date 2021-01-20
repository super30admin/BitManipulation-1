"""
Time Complexity : O(1) as max 32 shifts
Space Complexity : O(1) 
"""

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == 0:
            return 0
        
        if divisor == 1:
            return dividend
        
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        
        adivident = abs(dividend)
        adivisor =  abs(divisor)
        
        result  = 0
        while adivident >= adivisor:
            shift = 0
            while (adivident >= (adivisor << shift)):
                shift+=1
            shift -=1    
            result +=1 <<shift
            adivident = adivident - (adivisor << shift)
            
        if (dividend>0 and divisor>0) or (dividend<0 and divisor<0):
            return result
        else:
            return -result