class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        
        bitmask = nums[0]
        
        for i in range(1,len(nums)):
            bitmask ^= nums[i]
        
        return bitmask
