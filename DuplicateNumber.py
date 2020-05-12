'''
Solution:
The idea is to XOR all elements in a linear traversal where we end up in reaching the element that occurred only once.

Time Complexity:    O(n)
Space Complexity:   O(1)
--- Passed all testcases on leetcode successfully.
'''

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = nums[0]

        for i in range(1, len(nums)):
            result = result ^ nums[i]

        return result

