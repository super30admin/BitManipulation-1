# Time Complexity : Logarithmic
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        bitmask = 0 
 
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        
        res = 0
        
        while ldividend >= ldivisor:
            numShifts = 0
            while ldividend >= (ldivisor << numShifts):
                numShifts += 1
            numShifts -= 1
            
            ldividend = ldividend - (ldivisor << numShifts)
            
            res += 1 << numShifts 
        if dividend < 0 and divisor < 0:
            return res
        if dividend > 0 and divisor > 0:
            return res
        return -res