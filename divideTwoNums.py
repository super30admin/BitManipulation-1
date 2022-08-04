#Time Complexity: O(logn)
#Space Complexity: O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        dividend1 = abs(dividend)
        divisor1  = abs(divisor)
        result = 0
        
        while dividend1 >= divisor1:
            count = 0
            while dividend1 >= divisor1<<count:
                count += 1
            count -=1
            result += 1<<count
            
            dividend1 = dividend1 - (divisor1<<count)
            
        if dividend*divisor < 0:
            return -1*(result) 
        return result