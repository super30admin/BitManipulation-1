# Time Complexity : O(log(dividend)), Where dividend is input
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        #Edge case
        if(divisor==0 and dividend!=0):
            return 2147483647
        
        #we also need to add one more edge case
        if(dividend==-2147483648 and divisor==-1):
            return 2147483647
        
        ldividend=abs(dividend)
        ldivisor=abs(divisor)
        result=0
        while(ldividend>=ldivisor):
            shifts=0
            while(ldividend>=(ldivisor<<shifts)):
                shifts+=1
            shifts-=1#This is to undoing the extra shift
            result+=(1<<shifts)
            ldividend=(ldividend-(ldivisor<<shifts))
        
        if(dividend<0 and divisor>0):
            return -result
        elif(dividend>0 and divisor<0):
            return -result
        else:
            return result
            
        
    