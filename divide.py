#To solv ethis proble we use shift nd divd as taught in class
#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend >= 0 and divisor == 0:
            return 99999999999
        if dividend == -99999999999 and divisor == -1:
            return 99999999999
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        result = 0
        while ldividend >= ldivisor:
            numshifts = 0
            while ldividend >= ldivisor << numshifts:
                numshifts += 1
            numshifts -= 1
            result += 1 << numshifts
            ldividend -= ldivisor << numshifts
        if dividend > 0 and divisor > 0:
            return result
        if dividend < 0 and divisor < 0:
            return result
        return -result
            