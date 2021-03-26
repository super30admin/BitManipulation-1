"""
Time Complexity : O(1)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Explaination
<< -> left shift => multiply by 2
>> -> right shift => divide by 2

until dividend is greater than divisor:
    unitl dividend is greater than divisor:
        we left shift the divisor
        we keep track of each shift
    when we break we resuce shift by 1
    we change  the dividend here by substracting with divisor
    at each stage we update res with res += 2^shift

"""

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        res = 0
        if dividend >=0 and divisor ==0: return float('inf')
        MIN_INT = -2147483648
        MAX_INT = 2147483647
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT
        ndividend = abs(dividend)
        ndivisor = abs(divisor)
        
        while ndividend>=ndivisor:
            shifts = 0
            while ndividend >= (ndivisor << shifts):
                shifts += 1
            shifts -= 1
            res += 1<<shifts
            ndividend -= ndivisor<<shifts
        if dividend>0 and divisor>0: return res
        if dividend<0 and divisor<0: return res
        
        return -res
        
        