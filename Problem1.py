# Problem 1
# Divide Two Integers(https://leetcode.com/problems/divide-two-integers/)

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        if dividend == 0: return 0
        if dividend == INT_MIN and divisor == -1 : return INT_MAX
        absDividend = abs(dividend)
        absDivisor = abs(divisor)
        result = 0

        while absDividend >= absDivisor:
            numShifts = 1

            while absDivisor << numShifts <= absDividend:
                numShifts += 1
            numShifts -= 1

            result += 1 << numShifts
            absDividend = absDividend - (absDivisor << numShifts)

        if (dividend < 0 and divisor < 0) or (dividend > 0 and divisor > 0): return result
        if (dividend > 0 and divisor < 0) or (dividend < 0 and divisor > 0): return -result
        