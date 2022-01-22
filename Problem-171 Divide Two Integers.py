# 29. Divide Two Integers
# https://leetcode.com/problems/divide-two-integers/

# Time complexity: O(log n)
# Space Complexity: O(1)

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        intMax = (2**31) - 1
        intMin = -2**31
        
        if dividend == intMin and divisor == -1:
            return intMax
        
        newDividend = abs(dividend)
        newDivisor = abs(divisor)
        
        result = 0
        
        while newDividend >= newDivisor:
            shifts = 0
            temp = newDivisor
            
            while temp <= newDividend:
                temp = temp << 1
                shifts += 1
            
            temp = temp // 2
            shifts -= 1
            
            result += 2**shifts
            
            newDividend -= temp
        
        if dividend < 0 and divisor > 0 or dividend > 0 and divisor < 0: 
            return -result
        return result