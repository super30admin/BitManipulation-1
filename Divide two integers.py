# Time complexity: O(log n)
# Space complexity: O(1)
# Approach: shift left operator multiplies the value by 2^i for i times shift
# shift the divisor until the value becomes greater than dividend
# take the times of shift till the value was lesser or equal to dividend
# result = result + (1<< times of shift)
# to take care of remaining part, dividend = dividend - (divisor<<shift)



import sys
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        minint = -2**31
        maxint = (2**31)-1
        if dividend == minint and divisor == -1: return maxint
        result = 0
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        while ldividend >= ldivisor:
            shifts = 0
            while ldividend >= (ldivisor << shifts):
                shifts += 1
            shifts -= 1
            result = result + (1<<shifts)
            ldividend = ldividend - (ldivisor << shifts)
        if((dividend < 0 and divisor > 0) or (dividend > 0 and divisor < 0)):
            return -result
        return result
            
            
            
            
        