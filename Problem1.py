#Time Complexity: O(logN)
#Space Complexity: O(1)
import sys
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        MAX_INT = 2147483647        # 2**31 - 1
        MIN_INT = -2147483648       # -2**31

        if dividend == MIN_INT and divisor == -1:
            return MAX_INT
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        result = 0
        while ldividend >= ldivisor:
            shift = 0
            while(ldividend >= (ldivisor << shift)):
                shift +=1
            shift -=1
            result += 1 << shift
            ldividend -= (ldivisor << shift)
            
        if divisor > 0 and dividend >0:
            return result
        if divisor < 0 and dividend < 0:
            return result
        
        return -result
            
            