class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        ## T.C = O(log n)
        ## S.C = O(1)

        if dividend == pow(-2, 31) and divisor == -1: return pow(2, 31) - 1

        tmp_dividend = abs(dividend)
        tmp_divisor = abs(divisor)
        result = 0

        while tmp_dividend >= tmp_divisor:
            shifts = 0

            while tmp_dividend >= (tmp_divisor<<shifts):
                shifts += 1
            
            shifts -= 1
            result += 1 << shifts
            tmp_dividend = tmp_dividend - (tmp_divisor << shifts)
        
        if dividend < 0 and divisor > 0 :
            return -result
        if dividend > 0 and divisor < 0 :
            return -result
        
        return result