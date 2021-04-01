# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        #XOR everything in nums
        bitmask = 0
        for num in nums:
            bitmask ^= num
        
        return bitmask