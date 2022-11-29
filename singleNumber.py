#Time: O(n)
#Space: O(1)
#Program ran on leetcode successfully


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for i in range(len(nums)):
            result ^= nums[i]
        
        return result
        