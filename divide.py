# Time: O(logn)
# Space: O(1)
# Did it run on Leetcode: yes

class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        if(divisor==0):
            return float('inf')
        if(dividend==float('-inf') and divisor ==-1):
            return float('inf')
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        res=0
        sign = -1 if (dividend < 0) ^ (divisor < 0) else 1
        dividend=abs(dividend)
        divisor=abs(divisor)
        while(dividend>=divisor):
            shifts=0
            while(dividend>=divisor<<shifts):
                shifts+=1
            shifts-=1
            res+=(1<<shifts)
            dividend=dividend-(divisor<<shifts)
        res=res*sign
        res = min(max(res, INT_MIN), INT_MAX)
        return res