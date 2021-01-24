#Time Complexity : O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == 0:
             return 0
        if divisor == 1:
            return dividend
        MIN_INT = -2147483648
        MAX_INT = 2147483647
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT

        Dividend = abs(dividend)
        Divisor = abs(divisor)

        result = 0
        while Dividend >= Divisor:
            shifts = 0
            while Dividend >= (Divisor << shifts):
                shifts += 1

            shifts -= 1
            result += 1 << shifts
            Dividend -= Divisor << shifts

        if dividend > 0 and divisor > 0:
            return result
        if dividend < 0 and divisor < 0:
            return result

        return -result
