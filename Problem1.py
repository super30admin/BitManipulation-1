# Problem1: Divide Two Integers(https://leetcode.com/problems/divide-two-integers/)
# Time Complexity: O(log^2 N), where N = dividend, Outer while loop runs O(log N) times (each round removes a large chunk)and Inner while loop also runs up to O(log N) times per outer iteration
# Space Complexity: O(1),only a few integer variables used
# Approach:
# We can't use *, /, or %, so we simulate division using subtraction and bit shifts. 
# Left shift (<<) doubles a number, so instead of subtracting the divisor one at a time (slow, O(N)), we find the largest power-of-2 multiple of the divisor that still fits inside what's left of the dividend, subtract that whole chunk at once, and add the count of divisors it represents to the result. 
# Repeating this drains the dividend in O(log N) rounds instead of N rounds. 
# Signs are stripped at the start and reapplied at the end. 
# One overflow edge case is handled upfront: the most negative 32-bit int divided by -1.

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # Special case: -2^31 / -1 = 2^31, which overflows the 32-bit
        # signed range (max allowed is 2^31 - 1). Clamp to the max instead.
        if dividend == -2 ** 31 and divisor == -1:
            return 2 ** 31 - 1

        # Work with positive values only, fix the sign at the very end
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        result = 0

        # Keep going while at least one more divisor can still fit
        while ldividend >= ldivisor:
            numshifts = 1

            # Find how many times we can double the divisor and still
            # fit inside ldividend (this loop overshoots by one step)
            while (ldivisor << numshifts) <= ldividend:
                numshifts += 1

            # Step back one, since the last value tested was too big
            numshifts -= 1

            # 1 << numshifts = how many copies of divisor this chunk represents
            result += 1 << numshifts

            # Remove that whole chunk (divisor doubled numshifts times) at once
            ldividend -= ldivisor << numshifts

        # Reapply the correct sign based on the original inputs
        if dividend < 0 and divisor < 0:
            return result
        if dividend < 0 or divisor < 0:
            return -result

        return result