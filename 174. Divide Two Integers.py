class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend != 0 and divisor == 0:
            return (2 ** 31) - 1
        if dividend == -(2 ** 31) and divisor == -1:
            return (2 ** 31) - 1

        result = 0
        ldividend = abs(dividend)
        ldivisor = abs(divisor)

        while ldividend >= ldivisor:
            shifts = 0
            while ldividend >= (ldivisor << shifts):
                shifts += 1
            shifts -= 1
            result += (1 << shifts)

            ldividend = ldividend - (ldivisor << shifts)

        if (dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0):
            return result

        return -result

# bit manipulation
# Time complexity: O(logn)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No