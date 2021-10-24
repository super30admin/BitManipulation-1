"""
Time Complexity : O(n) where n if length of string s
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # Constants.
        MAX_INT = 2147483647        # 2**31 - 1
        MIN_INT = -2147483648  
        if dividend != 0 and divisor == 0:
            return MAX_INT
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT
        # We take the absolute value and calculate the division and then apply sign
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        result = 0
        # While divisor is greater than the dividend we left shift the divisor and
        # increment the no. of shifts whenever the left shit of divisor is less than
        # dividend other we decrement it by 1. We store the number in result by left
        # shifting the num of shifts we calculated. We then calculate the sign and
        # apply accordingly
        while ldividend >= ldivisor:
            numShifts = 0
            while ldividend >= ldivisor << numShifts:
                numShifts += 1
            numShifts -= 1
            result = result + (1 << numShifts)
            ldividend = ldividend - (ldivisor << numShifts)
        if divisor > 0 and dividend > 0:
            return result
        if divisor < 0 and dividend < 0:
            return result
        return -result