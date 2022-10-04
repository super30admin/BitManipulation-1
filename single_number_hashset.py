# Time Complexity : O(N) where N is total numbers in the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        single = nums[0]
        for num in nums[1:]:
            single ^= num
            
        return single