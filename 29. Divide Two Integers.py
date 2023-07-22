#Time Complexity:O(log n)
#Space Complexity:O(n)

class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        div=dividend
        divi=divisor
        dividend=abs(dividend)
        divisor=abs(divisor)
        result=0
        while dividend>=divisor:
            shift=0
            while dividend>=divisor<<shift:
                shift=shift+1
            shift=shift-1
            result=result+(1<<shift)
            dividend=dividend-(divisor<<shift)
        if div<0 and divi>0:
            return int(-result)
        if div>0 and divi<0:
            return int(-result)
        return min(2147483647,int(result))
