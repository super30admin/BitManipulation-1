# problem 1 

# https://leetcode.com/problems/divide-two-integers/description/

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1
        ldivident = abs(dividend)
        ldivisor = abs(divisor)
        result = 0 
        while ldivident >= ldivisor:
            numShifts = 1
            while (ldivisor << numShifts) <= ldivident:
                numShifts += 1
            numShifts -= 1
            result += 1 << numShifts
            ldivident -= ldivisor << numShifts 
        if dividend < 0 and divisor < 0:
            return result 
        if dividend < 0 or divisor < 0:
            return -result
        return result 