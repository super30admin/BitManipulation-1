# Time:O(logn)
# Space:O(1)
# Leetcode:Yes
# Issues:None

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        
        absDivisor = abs(divisor)
        absDividend = abs(dividend)
        result = 0
 
        while absDividend >= absDivisor:
            shifts = 1
            while (absDivisor << shifts) <= absDividend:
                shifts += 1
            shifts -=1

            result += 1 << shifts

            absDividend = absDividend - (absDivisor << shifts)

        if divisor < 0 and dividend < 0: return result
        if divisor > 0 and dividend > 0: return result
        return -result
