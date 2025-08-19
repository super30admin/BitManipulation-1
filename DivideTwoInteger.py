class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31-1
        ldiv = abs(dividend)
        ldivisor = abs(divisor) 
        res = 0
        while ldiv>=ldivisor:
            shifts = 0
            curr = ldivisor
            while (curr<<1) <=ldiv:
                curr = curr<<1
                shifts+=1
            res+=1<<shifts
            ldiv-=curr
        if dividend<0 and divisor<0:
            return res
        if dividend<0 or divisor<0:
            return -res
        return res