# Time complexity - k*O(log n) where k is the number of cycles/repetitions.
# Space complexity - O(1)
# Did this solution run on leetcode? - yes
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # edge cases
        if dividend == 0: 
            return 0
        if divisor == 1:
            return dividend
        
        # EDGE CASE (OVERFLOW ISSUE)
        MIN_INT = -2147483648 
        MAX_INT =  2147483647
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT
        
        # keep the absolute dividend and divisor
        absDividend = abs(dividend)
        absDivisor = abs(divisor)
        
        # logic
        result = 0
        while absDividend >= absDivisor:
            numShifts = 0
            # double the number until its less than the dividend.
            # keep shifting until the dividend is less than the divisor*shifts
            while absDividend >= (absDivisor << numShifts):
                numShifts += 1
            
            # subtract in the case when the condition is evaluated to False.
            numShifts -= 1 
            # add the shifts to the result. 
            result += (1<<numShifts)
            # update the dividend
            absDividend -= (absDivisor << numShifts)
        
        # return negative of the result if either of dividend and divisor is negative.
        return result if ((dividend<0 and divisor<0) or (dividend>0 and divisor>0)) else -result
            
    
# Time complexity - O(n)) where k is the number of cycles/repetitions.
# Space complexity - O(1)
# Did this solution run on leetcode? - no (TLE)
# Repeatedly subtracting divisor from the dividend.
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # edge cases
        if dividend == 0: 
            return 0
        if divisor == 1:
            return dividend
        
        # EDGE CASE (OVERFLOW ISSUE)
        MIN_INT = -2147483648 
        MAX_INT =  2147483647
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT
        
        # keep the absolute dividend and divisor
        absDividend = abs(dividend)
        absDivisor = abs(divisor)
        
        result = 0
        while absDividend - absDivisor >= 0:
            result += 1
            absDividend -= absDivisor
        
        return result if ((dividend<0 and divisor<0) or (dividend>0 and divisor>0)) else -result
        