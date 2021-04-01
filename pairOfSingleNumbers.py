# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        
        for num in nums:
            bitmask ^= num
        
        diff = bitmask & (-bitmask)
        bitmask2 = 0
        for num in nums:
                if num & diff != 0:
                    bitmask2 ^= num
        
        return [bitmask2, bitmask2 ^ bitmask]