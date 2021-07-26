class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        MIN_INT = -2147483648
        MAX_INT = 2147483647
        if dividend >= 0 and divisor==0:
            return MAX_INT
        if dividend <0 and divisor==0:
            return MIN_INT
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT

        abs_dividend = abs(dividend)
        abs_divisor = abs(divisor)
        result = 0
        while abs_dividend >= abs_divisor: #multiply by 2 until it becomes greater than dividend
            numShifts = 0
            while abs_dividend >= (abs_divisor << numShifts):
                numShifts += 1
            numShifts -= 1 
            result += (1 << numShifts) #2 ^ numshift
            abs_dividend -= (abs_divisor << numShifts)

        if ((dividend < 0 and divisor < 0) or (dividend > 0 and divisor > 0)):
            return result
        else:
            return -result
        