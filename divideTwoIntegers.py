'''
Time Complexity: O(log n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Check if dividend is negative overflowing and divisor is  -1 if true then return positive overflow number
take absolute value of dividend and divisor and put the sign after computing the quotient.
Every left shift of a bit multiplies a number by 2, so firstly left shift until the divisor is greater than dividend
Once its greater find the new dividend by subtracting it to the dividend by number of shifts of the divisor calculated and
the result is the power of 2 to the number of shifts which can be written in bit form as 1<<number of shifts.
'''


class Solution:
    def divide(self, _dividend: int, _divisor: int) -> int:

        if _dividend == -2147483648 and _divisor == -1:
            return 2147483647

        result = 0
        dividend = abs(_dividend)
        divisor = abs(_divisor)

        while dividend >= divisor:
            numOfShifts = 0
            while dividend >= (divisor << numOfShifts):
                numOfShifts += 1
            numOfShifts -= 1
            # 31/4 = 0 -4, 1-8, 2-16, 3 -32
            # 31-16
            dividend = dividend - (divisor << numOfShifts)
            result += 1 << numOfShifts  # find the power of number of shifts

        if (_dividend > 0 and _divisor > 0) or (_divisor < 0 and _dividend < 0):
            return result

        return -result