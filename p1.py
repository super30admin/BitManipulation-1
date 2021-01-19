#Time: O(1)
#Space; O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        
        if (dividend >=0 and divisor == 0):
            return float('inf')
        
        if (dividend <0 and divisor == 0):
            return float('-inf')

       
        tempDividend = abs(dividend)
        tempDivisor = abs(divisor)
        finalQuotient = 0

     
        while (tempDividend >= tempDivisor):

           
            numOfShifts = 0

          
            while (tempDividend >= (tempDivisor << numOfShifts)):
                numOfShifts += 1
            numOfShifts -= 1

          
            tempDividend = tempDividend - (tempDivisor << numOfShifts)

           
            finalQuotient += (1 << numOfShifts)

      
        if ((dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0)):
            return finalQuotient
        else:
            return -finalQuotient
