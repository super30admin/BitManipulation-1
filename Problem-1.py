# Time Complexity : O(log N)  # We repeatedly double the divisor
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Explanation:
# Since multiplication, division, and mod are not allowed,
# we simulate division using subtraction with exponential doubling.
# We keep doubling the divisor (using left shift) until it exceeds dividend.
# Subtract the largest possible multiple and continue.
# Handle overflow case for INT_MIN / -1.

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        if dividend == INT_MIN and divisor == -1:
            return INT_MAX
        
        sign = -1 if (dividend < 0) ^ (divisor < 0) else 1
        
        dividend = abs(dividend)
        divisor = abs(divisor)
        
        result = 0
        
        while dividend >= divisor:
            temp = divisor
            multiple = 1
            
            while dividend >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            
            dividend -= temp
            result += multiple
        
        return sign * result