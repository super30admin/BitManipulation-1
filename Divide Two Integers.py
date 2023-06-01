class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # Time O(n)
        # Space O(1)
        if divisor == 0: return 2**31 - 1
        if dividend == -2**31 and divisor == -1: return 2**31 - 1

        result = 0
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        while ldividend >= ldivisor:
            shifts = 0
            while ldividend >= (ldivisor << shifts):
                shifts += 1
            shifts -= 1
            result += 1 << shifts
            ldividend = ldividend - (ldivisor << shifts)
        
        if (dividend < 0 and divisor < 0) or (dividend > 0 and divisor > 0):
            return result
        return -result
