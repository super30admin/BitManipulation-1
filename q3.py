# Time Complexity : O(n), Where n is the length of the nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        
        #Edge Case
        if(len(nums)<=2):
            return nums
        
        temp=0
        for i in nums:
            temp=temp^i
        
        temp2=temp&(~temp+1)#Bitwise and of (temp, temp's twos complement)
        
        temp3=0
        for i in nums:
            if(temp2&i!=0):
                temp3=temp3^i
        
        a=temp3
        b=temp^a
        
        return [a,b]