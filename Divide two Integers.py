# Time:- O(1)
# Space:- O(1)
    
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend==0:
            return 0
        if divisor==1:
            return dividend
        if dividend==-sys.maxsize and divisor==-1:
            return sys.maxsize
        dividend,divisor=abs(dividend),abs(divisor)
        res=0
        while dividend>=divisor:
            shift=0
            while dividend>=(divisor<<shift):
                shift+=1
            shift-=1
            res+=1<<shift
            dividend=dividend-(divisor<<shift)
        if (dividend>0 and divisor>0) or (dividend<0 and divisor<0):
            return -res
        return res
            