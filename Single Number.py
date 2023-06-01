class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        
        # BRUTE FORCE APPROACH
        
        # if len(nums) == 1:
        #     return nums[0]
        # nums.sort()
        # l = len(nums)
        # for i in range(0, l, 2):
        #     if i == l - 1:
        #         return nums[i]
        #     if nums[i] != nums[i+1]:
        #         return nums[i]
        
        # OPTIMISED APPROACH 
        # Space Complexity: O(n)
        
        # count = set()
        # for i in nums:
        #     if i not in count:
        #         count.add(i)
        #     else:
        #         count.remove(i)
        # for e in count:
        #     return e
        
        # OPTIMISED APPROACH 
        # SPACE COMPLEXITY: O(n) 
        res = 0
        for i in nums:
            res = i ^ res
        return res
