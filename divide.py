# Time Complexity : O(log n)
# Space Complexity : O(1)

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if divisor == 0 and dividend != 0:
            return sys.maxsize()
        if dividend == -2**31 and divisor == -1:
            return 2**31-1
        x = abs(dividend)
        y = abs(divisor)
        res = 0
        while x >= y:
            shifts = 0
            while x >= y << shifts:
                shifts += 1
            shifts -= 1
            res += 1 << shifts
            x = x - (y << shifts)

        if (dividend > 0 and divisor < 0) or (dividend < 0 and divisor > 0):
            return -res
        return res
