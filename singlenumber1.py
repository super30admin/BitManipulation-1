#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:

    def singleNumber(self, nums: List[int]) -> int:
        
        result = 0
        for el in nums:
            result  ^=  el
        return result
            