#Time: O(n)
#Space: O(1)
#Program ran on leetcode successfully

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if divisor == 0:
            return float('inf')
        if dividend == float('-inf') and divisor == -1:
            return float('inf')
        
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        
        res = 0
        while (ldividend >= ldivisor):
            shifts = 0
            while (ldividend >= (ldivisor << shifts)):
                shifts += 1
            shifts += -1
            res += 1 << shifts
            ldividend = ldividend - (ldivisor << shifts)
        
        if (dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0):
            return res
        return -res
        