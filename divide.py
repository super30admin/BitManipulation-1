# Time Complexity : O(logn) where n is the size of divide
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        sign = 1
        if (dividend > 0 and divisor < 0) or (dividend < 0 and divisor > 0): sign = -1

        result = 0
        dividend = abs(dividend)
        divisor = abs(divisor)
        max_int = 2 ** 31 - 1

        while dividend >= divisor:
            temp = divisor
            quotient = 1
            while temp <= dividend:
                temp <<= 1
                quotient <<= 1
            result += quotient >> 1
            dividend -= temp >> 1

        if result > max_int:
            if sign == -1 and divisor == 1: return ~max_int
            else: return max_int

        return ~(result) + 1 if sign == -1 else result
