# Time Complexity: O(N) in the worst case where N = dividend and the divisor is 1
# Space Complexity: O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1

        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        result = 0

        while ldividend >= ldivisor:
            current = ldivisor
            numShifts = 0

            while (current << 1) <= ldividend:
                numShifts += 1
                current <<= 1

            result += 1 << numShifts
            ldividend -= current

        if dividend < 0 and divisor < 0:
            return result
        if dividend < 0 or divisor < 0:
            return -result
        return result