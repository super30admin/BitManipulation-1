# Time Complexity : O(Log(n)) where n is the Dividend
# Space Complexity:o(1)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        MAX_INT = 2147483647  # 2**31 - 1
        MIN_INT = -2147483648
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT

        Ldividend = abs(dividend)
        Ldivisor = abs(divisor)

        result = 0

        while Ldividend >= Ldivisor:
            steps = 0
            while Ldividend >= (Ldivisor << steps):
                steps += 1

            steps -= 1
            result = result + (1 << steps)

            Ldividend = Ldividend - (Ldivisor << steps)

        if (dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0):
            return result

        return -result
