import sys
"""
Time Complexity - O(log N)
Space Complexity - O(1)

The Program asks to find  divide two integers without using multiplication, division and mod operator.
Only Bitwise operator can help us in performing division.
All these operation internally use bitwise to perform calcualation

The algo works as follows
 1. Take out negative signs of both divisor and divident
 2. Find the highest power of divisor in which divident can fit
 3. Store the power in variable.Let shift be result
 4. Add the power to result
 5.Now subtract the highest power of divisor from dividend.Let this be newDividend
 6. Repeact above steps until dividend is smaller than divisor 
"""
class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        if divisor == 0:
            return sys.maxsize
        elif divisor == -1 and dividend == -2147483648:
            return 2147483647
        ldividend = abs(dividend)
        ldivisor = abs(divisor)

        result = 0
        while ldividend >= ldivisor:
            shifts = 0
            while ldividend >= (ldivisor << shifts):
                shifts = shifts + 1
            shifts = shifts - 1
            ldividend = ldividend - (ldivisor << shifts)
            result = result + ( 1 << shifts)

        if dividend > 0 and divisor > 0 or divisor < 0 and dividend < 0:
            return result 
        return -result


dividend = -2147483648
divisor = -1
sol = Solution()
ans = sol.divide(dividend,divisor)
print(ans)
        