class Solution:
   
    def divide(self, dividend: int, divisor: int) -> int:        
        
        if not divisor:
            return 0
        result = 0  
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        
        ogdivisor = divisor
        ogdividend = dividend
        dividend = abs(dividend)
        divisor = abs(divisor)
        while dividend >= divisor:
            count = 0            
            while (divisor<< count) <= dividend :
                count +=1            
            count -=1
            result += 1<<count
            print(count,result)
            
            dividend = dividend - (divisor << count)
        if ogdividend < 0 and ogdivisor < 0:            
            return result
        if ogdividend > 0 and ogdivisor > 0:            
            return result
        return -result
