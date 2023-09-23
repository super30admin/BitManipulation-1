# Time Complexity: O(log^2n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        sign = -1 if (dividend >= 0 and divisor < 0) or (dividend < 0 and divisor >= 0) else 1
        dividend = (abs(dividend))
        divisor = (abs(divisor))
        result = (len(range(0, (dividend - divisor + 1), divisor)))
        if sign == -1:
            result = -result
        minus_limit = (-(2 ** 31))
        plus_limit = ((2 ** 31) - 1)
        result = (min(max(result, minus_limit), plus_limit))
        return result