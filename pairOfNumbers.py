#Time: O(n)
#Space: O(1)
#Program ran on leetcode successfully

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for i in range(len(nums)):
            bitmask ^= nums[i]
        
        temp = bitmask & (-bitmask)
        bitmask1 = 0
        for i in range(len(nums)):
            if (temp & nums[i]):
                bitmask1 ^= nums[i]
        
        return [bitmask1, bitmask1 ^ bitmask]
        