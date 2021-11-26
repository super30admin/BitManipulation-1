# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

# left shift shift shift , answer greater than divident find remainder, remainder greater than divisor phase 2

class Solution:
    def divide(self, divident: int, divisor: int) -> int:
        if divisor ==0 and divident != 0:
            return 2147483647
        if divident == -2147483648 and divisor==-1:
            return 2147483647
        result=0
        ldivid=abs(divident)
        ldivis=abs(divisor)
        while ldivid>=ldivis:
            shifts=0
            while ldivid>=(ldivis<<shifts):# multiply 2 until it bcoms greater than divident
                shifts+=1
            shifts-=1
            result+=(1<<shifts)
            ldivid=ldivid-(ldivis<<shifts)# multiply 2 until  ... and subtract and if diff is greater then again continue 2nd phase
        if divident>0 and divisor>0 or divident<0 and divisor<0:
            return result
        else:
            return -result
        