# Time Complexity : O(n)
# Space Complexity :O(1)
# Passed on Leetcode: yes

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        if divisor == 0:
            return INT_MAX if dividend > 0 else INT_MIN

        if dividend == 0:
            return 0
        
        negative = (dividend < 0) ^ (divisor < 0)

        dividend = abs(dividend)
        divisor = abs(divisor)

        quotient = 0
        while dividend >= divisor:
            current_divisor = divisor
            multiple = 1

            while dividend >= (current_divisor << 1):
                current_divisor <<= 1
                multiple <<= 1

            dividend -= current_divisor

            quotient += multiple

        if negative:
            quotient = -quotient

        if quotient > INT_MAX:
            return INT_MAX
        elif quotient < INT_MIN:
            return INT_MIN
        else:
            return quotient
