class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        if divisor == 0:
            return float('inf')
        INT_MIN = -2**31
        INT_MAX = 2**31 - 1
        if dividend == INT_MIN and divisor == -1:
            return INT_MAX
        result = 0
        negative = (dividend < 0) != (divisor < 0)
        ldividend = abs(dividend)
        ldivisor = abs(divisor)
        while ldividend >= ldivisor :
            shift = 0
            while ldividend >= (ldivisor << shift):
                shift += 1
            shift -= 1
            result = result + (1 <<shift)  
            ldividend -= ldivisor << shift
        return -result if negative else result
        #Tc : O(Log(Dividend/Divisor))
        # Sc : O(1)



