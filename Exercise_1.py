# S30 Problem #174 Divide Two Integers
#LeetCode #29 https://leetcode.com/problems/divide-two-integers/description/

# Author : Akaash Trivedi
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# bit manipulation
# convert both numbers to positive
# left shift the divisor to gets its multiple and subtract will reaching dividend
# the number of shifts is equal to quotient
# time complexity O(log n) n= dividend
# space comlexity O(1)

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1
        if divisor == 1:
            return dividend

        ldividend = abs(dividend)
        ldivisor = abs(divisor)

        res = 0

        while ldivisor <= ldividend:
            shifts = 0
            # left shift same as multiply by 2
            while (ldivisor << shifts) <= ldividend:
                shifts += 1
            # as we added extra one in previous while loop
            shifts -= 1

            ldividend -= ldivisor << shifts
            res += 1 << shifts  # 2 power shifts

        # check if quotient positive: same sign give positive res
        if (dividend < 0) == (divisor < 0):
            return res
        else:
            return -res