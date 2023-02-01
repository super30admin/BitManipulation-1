# Time Complexity : O(n), Where n is the length of the nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        if(len(nums)==0):
            return -1
        
        result=0
        for i in nums:
            result=result^i
        return result