#Time Complexity : O(n) 
#Space Complexity : O(1) 

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        x = 0
        for num in nums:
            x^=num
            
        return x