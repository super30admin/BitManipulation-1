'''
Solution:
1.  Iterate until dividend is less than divisor, and keep updating dividend by maintaining an inner iteration.
2.  In the inner iteration, iterate until, dividend is less than divisor shifted left shift times and update dividend
    accordingly.
3.  Add to quotient, number of shifts shifted left to 1 after each inner iteration and perform sign manipulation before
    returning the final quotient

Time Complexity:    O(logN)
Space Complexity:   O(1)
--- Passed all testcases on leetcode successfully.
'''

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        #   edge case check
        if (dividend == -(1 << 31) and divisor == -1):
            return ((1 << 31) - 1)

        #   initializations
        tempDividend = abs(dividend)
        tempDivisor = abs(divisor)
        finalQuotient = 0

        #   iterate until dividend is less than divisor
        while (tempDividend >= tempDivisor):

            #   for each iteration, reset number of shifts
            numOfShifts = 0

            #   iterate until, dividend is less than divisor shifted left shift times
            while (tempDividend >= (tempDivisor << numOfShifts)):
                numOfShifts += 1
            numOfShifts -= 1

            #   update dividend
            tempDividend = tempDividend - (tempDivisor << numOfShifts)

            #   add to quotient, number of shifts shifted left to 1
            finalQuotient += (1 << numOfShifts)

        #   perform sign manipulation before returning the final quotient
        if ((dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0)):
            return finalQuotient
        else:
            return -finalQuotient