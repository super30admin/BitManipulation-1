class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        #Tc: O(logn) Sc: O(1)
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1
            
        negative = (dividend < 0) ^ (divisor < 0)
        
        # Convert both numbers to positive
        abs_dividend = abs(dividend)
        abs_divisor = abs(divisor)

        result = 0
        while abs_dividend >= abs_divisor:
            temp = abs_divisor
            multiple = 1
            while abs_dividend >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            abs_dividend -= temp
            result += multiple

        return -result if negative else result
        