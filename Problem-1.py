class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if (divisor==0) or (dividend==-2147483648 and divisor==-1) or (dividend==2147483648 and divisor==1):
            return 2147483647
        new_dividend=abs(dividend)
        new_divisor=abs(divisor)
        output=0
        while new_dividend>=new_divisor:
            shifts=0
            while new_dividend>=(new_divisor<<shifts):
                shifts+=1
            shifts-=1
            output+=(1<<shifts)
            new_dividend=new_dividend-(new_divisor<<shifts)
        
        if (dividend<0 and divisor<0) or (dividend>0 and divisor>0):
            return output
        return output * -1
        