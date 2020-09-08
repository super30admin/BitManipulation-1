class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        res = 0
        if divisor ==0:
            return sys.maxint
        if divisor == -1 and dividend == -2147483648:
            return 2147483647
        
        
        abs_dividend = abs(dividend)
        abs_divisor = abs(divisor)
        
        while abs_dividend >= abs_divisor:
            num_shift = 0
            
            while abs_dividend >= (abs_divisor << num_shift): # << = *2
                num_shift += 1 #shift until dividend is greater

            num_shift -= 1
            
            res += 1 << num_shift
            
            abs_dividend -= (abs_divisor << num_shift) #if remainder is greater, update dividend
        
        if dividend > 0 and divisor > 0 or dividend < 0 and divisor < 0:
            return res
        else:
            return -res #if either one is negative, res will be negative