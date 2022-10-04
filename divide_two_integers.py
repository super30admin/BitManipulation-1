# Time Complexity : O(N) where N is divident
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        if divisor == 0:
            return float('inf')
        if dividend == float('inf') or divisor == 0:
            return float('inf')
        
        result = 0
        
        pDividend = abs(dividend)
        pDivisor = abs(divisor)
        
        while pDividend >= pDivisor:
            count = 0
            
            while pDividend >= (pDivisor << count):
                count += 1
                
            count -= 1
            result += 1 << count
            pDividend = pDividend - (pDivisor << count)
        
        if dividend < 0 and divisor < 0:
            return result
        
        if dividend > 0 and divisor > 0:
            return result
        
        return -result