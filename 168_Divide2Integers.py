'''
Accepted on leetcode(29)
time - O(log(result^2))
space - O(1)
Approach:
1. Calculate for positive numbers(absolute values) first and then convert to negative.
2. iterate until dividend is greater then divisor and add the number to the variable.
3. Calculate the diff between dividend and calculated number, if greater than 0, iterate again for remaining dividend for same divisor.
4. finally return result based on actual positive or negative values.
'''


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # edge case
        if dividend == -2147483648 and divisor == -1:
            return 2147483647

        # get the absolute values, to handle only positive numbers and return negative value at last if dividend or divisor is negative.
        a = abs(dividend)
        b = abs(divisor)

        result = 0

        while a >= b:
            numShifted = 0
            while a >= (b << numShifted):
                numShifted += 1
            numShifted -= 1

            # no. of times shifted and final value of dividend left.
            a = a - (b << numShifted)  # a = 4 , if dividend = 100 and divisor = 3

            result += 1 << numShifted

        if (divisor < 0 and dividend < 0) or (divisor > 0 and dividend > 0):
            return result
        return -result



