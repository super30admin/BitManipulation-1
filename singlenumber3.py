class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bit1 = 0
        for i in nums:
            bit1 = bit1 ^ i
        bit2 = bit1 & (~bit1 + 1)

        temp = 0

        for i in nums:
            if i & bit2 != 0:
                temp = temp ^ i
        
        return [temp, temp ^ bit1]
        
        