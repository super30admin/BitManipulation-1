# Time Complexity : O(N) where N is total numbers in the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask, bitmask2 = 0, 0
        for n in nums:
            bitmask ^= n
            
        temp = bitmask & -bitmask
        for n in nums:
            if n & temp != 0:
                bitmask2 ^= n
                
        return [bitmask2, (bitmask2^bitmask)]