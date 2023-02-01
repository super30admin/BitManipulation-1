class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        ## T.C = O(n)
        ## S.C = O(1)
        
        xor_1 = 0
        for i in nums:
            xor_1 = xor_1 ^ i
        
        temp = xor_1 & (- xor_1)
        xor_2 = 0
        for i in nums:
            if (temp & i) != 0:
                xor_2 = xor_2 ^ i
        
        return [xor_2, xor_1^xor_2]
