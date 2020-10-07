#Time complexity: O(n)
#Space complexity: O(n)
# Works on leetcode: yes 
# Approach: We just subract the sum of all numbers from twice thsum of all distinct numbers 
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return 2*sum(set(nums))-sum(nums)