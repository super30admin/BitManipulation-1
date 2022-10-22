# Time complexity : O(log k)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def divide(self, numer: int, deno: int) -> int:
        
        # if the numerator is max min_val and the deno is -1, then return the max integer val
        if numer == -pow(2,31) and deno == -1:
            return pow(2,31) - 1
        
        # take the absolute of the two values
        dividend = abs(numer)
        divisor = abs(deno)
        
        # making res as 0
        res = 0
        
        # traverse until the dividend is greater than or equal to divisor
        while dividend >= divisor:
            
            # shifting the bits of divisor by shift bits
            shift = 0
            
            # here we check for the bits of shifting of divisor until it's greater than dividend
            while dividend >= (divisor << shift):
                    shift += 1
            
            # decrement one bit of shift
            shift -= 1
            
            # add the shifts of 2^shifts which is done by 1 << shift and add tp res
            res += 1 << shift
            
            # update the divident by subtracting the divisor by shifting the bits by the count of shifts
            dividend -= (divisor << shift)
            
        # if both the numbers were negativem then result is positive
        if numer < 0 and deno < 0:
            return res
          
        # if either of the number were negative, then result is negative
        elif numer < 0 or deno < 0:
            return -res
         
        # else just return the result
        return res
