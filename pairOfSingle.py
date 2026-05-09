class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ex=0
        for num in nums:
            ex^=num
        
        return ex