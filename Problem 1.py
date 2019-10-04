# Time Complexity : O(log n) where n is the diviend
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        # Checking for 2 edge cases. 1. if the divident is at the start of the range of int and divisor is -1 then return max value of int. 2. If divisor is 0 then return divisor
        if (dividend == -2147483648 and divisor == -1) or divisor == 0:
            return 2147483647

        # take absolute of values. The sign will be take care at the last
        ddnt = abs(dividend)
        dvsor = abs(divisor)

        num = 0
        # while dividend is greater than divisor
        while (ddnt >= dvsor):

            x = 0
            # while on single run the value of shifting the divisor doesnt exceed the present dividend then keep shifting
            while (ddnt >= dvsor << x):
                x += 1

            # decrease x(parity) by 1 to get the value below the dividend
            x -= 1
            # update the value of dividend
            ddnt -= dvsor << x
            # find the quotient
            num += 1 << x

        # check for the positvity and nagativity of the numbers and return quotient accordingly
        if (dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0):
            return num
        else:
            return -num