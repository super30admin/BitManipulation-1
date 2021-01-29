# Time:- O(n)
# Space:- O(1)
# Approach:- If we xor the number with itself we get 0, since there are two occurences of every number and 
# every number appears twice except once.
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        i=nums[0]
        for j in range(1,len(nums)):
            i=i^nums[j]
        return i
        