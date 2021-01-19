"""
Time Complexity : O(1) as max 32 shifts
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == 0:
            return 0
        if divisor == 1:
            return dividend
        MIN_INT = -2147483648
        MAX_INT = 2147483647
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT

        absDividend = abs(dividend)
        absDivisor = abs(divisor)

        result = 0
        while absDividend >= absDivisor:  # Double it until it is less than dividend
            numShifts = 0
            while absDividend >= (absDivisor << numShifts):
                numShifts += 1
            numShifts -= 1
            result += (1 << numShifts)
            absDividend -= (absDivisor << numShifts)

        return result if ((dividend < 0 and divisor < 0) or (dividend > 0 and divisor > 0)) else -result
