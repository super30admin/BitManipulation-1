#All TC passed on leetcode


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        #Here we keep left shifting divisor until it exceeds dividend. Then we check if diff of dividend and 
        #left shifted divisor is greater than divisor. if yes we update dividend an repeat above steps. 
        #The number of times we left shift raised to 2 is the result.
        #Time complexity - O(k) - where k<quotient<dividend
        #Space complexity - O(1)
        cDivisor = abs(divisor)
        cDividend = abs(dividend)
        res = 0

        if dividend == -2147483648 and divisor==-1:
            return 2147483647

        while cDividend >= cDivisor:
            shifts = 0

            while cDividend >= (cDivisor << shifts):
                shifts += 1
            
            
            shifts -= 1
            cDividend = cDividend - (cDivisor << shifts)
            res += pow(2, shifts)

        if divisor>0 and dividend>0 or divisor<0 and dividend<0:
            return res

        return -res



#------------------------------------OR------------------------------------------

        #Here we keep adding divisor until it exceeds dividend. The number of times we add it is the result.
        #Time complexity - O(quotient) - sometime if divisor is 1 then its O(n) resulting in time exceed 
        #Space complexity - O(1)
        count = 0
        divisorSum = 0
        cDivisor = abs(divisor)
        cDividend = abs(dividend)
        while divisorSum<=cDividend:
            divisorSum = divisorSum + cDivisor
            count+=1
        if divisor>0 and dividend>0 or divisor<0 and dividend<0:
            return count-1
        
        return -(count-1)
            