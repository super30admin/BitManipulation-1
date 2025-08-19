class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        
        maxInt = 2147483647
        minInt = -2147483648
        if dividend == minInt and divisor == -1: #base overflow case
            return maxInt

        tempDivisor = divisor
        tempDividend = dividend
        if divisor < 0:
            divisor = -divisor
        if dividend < 0:
            dividend = -dividend
        res = 0
        while dividend>=divisor:
            shifts = 0

            while dividend >= ( divisor<<shifts ):
                shifts += 1
            shifts -= 1 #backtrack the extra shift
            dividend -= (divisor<<shifts)
            res += (1<<shifts)
        if (tempDivisor < 0 and tempDividend < 0 ) or (tempDividend > 0 and tempDivisor > 0):
            return res
        return -res