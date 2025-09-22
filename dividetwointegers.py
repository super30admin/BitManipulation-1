# Time Complexity: O(log(dividend/divisor))
# Space Complexity: O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        if dividend == -2 ** 31 and divisor == -1:
            return 2 ** 31 - 1

        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        result = 0

        while ldivisor <= ldividend:
            current = ldivisor
            numshifts = 0
            while (current << 1) <= ldividend:
                numshifts += 1
                current <<= 1
            result += 1 << numshifts
            ldividend -= current

        if dividend < 0 and divisor < 0:
            return result

        if dividend < 0 or divisor < 0:
            return -result

        return result
