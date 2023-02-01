# TC : O(N)
# SC : O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        MAX_INT = 2147483647        # 2**31 - 1
        MIN_INT = -2147483648       # -2**31
        HALF_MIN_INT = -1073741824  # MIN_INT // 2
        
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT
        
        neg = 2
        if dividend>0:
            neg -= 1
            dividend = - dividend
        if divisor > 0:
            neg -= 1
            divisor = -divisor
        
        max_bit = 0
        while divisor >= HALF_MIN_INT and divisor + divisor >= dividend:
            max_bit += 1
            divisor += divisor
        quotient = 0
        for i in range(max_bit, -1, -1):
            if divisor >= dividend:
                quotient -= (1 << i)
                dividend -= divisor
            divisor = (divisor +1)>>1
        if neg==1:
            return quotient
        return -quotient