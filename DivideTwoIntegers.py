#time complexity: O(logn)
#Space complexity: O(1)
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2147483648 and divisor == -1:
            return 2147483647
        ldiv=abs(dividend)
        ldivisor=abs(divisor)
        res=0
        while ldiv >= ldivisor:
            count=0
            while (ldivisor << count) <= ldiv:
                count+=1
            count-=1
            res+= 1 << count
            ldiv = ldiv - (ldivisor<<count)
        if dividend*divisor < 0:
            return -1*res
        return res