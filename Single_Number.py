#Time:O(n)
#Space:O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0  
        for val in nums:
            bitmask=val^bitmask
        return bitmask