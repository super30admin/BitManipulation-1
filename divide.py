"""
TC and SC O(1)

"""


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        MIN_INT = -2147483648
        MAX_INT = 2147483647
        if dividend >= 0 and divisor==0:
            return MAX_INT
        if dividend <0 and divisor==0:
            return MIN_INT
        if divisor == 1:
            return dividend
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT

        absDividend = abs(dividend)
        absDivisor = abs(divisor)

        res = 0
        while absDividend >= absDivisor: #keep doubling it util it becomes less that dividend
            numShifts = 0
            while absDividend >= (absDivisor << numShifts):
                numShifts += 1
            numShifts -= 1 #one step ahead
            res += (1 << numShifts) #2 raise to power
            absDividend -= (absDivisor << numShifts)

        if ((dividend < 0 and divisor < 0) or (dividend > 0 and divisor > 0)):
            return res
        else:
            return -res
        