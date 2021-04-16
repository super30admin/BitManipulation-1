#Time Complexity:O(1)
#Space Complexity:O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend==0:
            return 0
        if divisor==1:
            return dividend
        if dividend==-2147483648 and divisor==-1:
            return 2147483647
        result=0
        absdividend=abs(dividend)
        absdivisor=abs(divisor)
        while absdividend>=absdivisor:
            numShifts=0
            while absdividend>=(absdivisor<<numShifts):
                numShifts+=1
            numShifts-=1
            absdividend-=(absdivisor<<numShifts)
            result+=(1<<numShifts)
        return result if ((dividend<0 and divisor<0) or (dividend>0) and divisor>0) else -result