# Time is O(logn) as we are doubling everytime.
# Space is O(1)

# The intuition here is to use the bitwise left shift operator which gives us the multiplication. So we can keep multiplying until we reach a value greater than dividend.
# However, once we reach greater than dividend, we also need to check if the difference is not greater than the divisor so thats why we have 2 while loops

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1
        absDividend = abs(dividend)
        absDivisor = abs(divisor)
        result = 0
        while absDividend >= absDivisor:
            noOfShifts = 1
            while (absDivisor << noOfShifts) <= absDividend:
                noOfShifts += 1
            # step back
            noOfShifts -= 1

            result += (1 << noOfShifts)
            absDividend -= (absDivisor << noOfShifts)
        if (dividend < 0 and divisor < 0) or (dividend > 0 and divisor > 0):
            return result
        return -result
