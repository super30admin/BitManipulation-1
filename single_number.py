class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ## T.C = O(n)
        ## S.C = O(1)

        xor = 0
        for i in nums:
            xor = xor ^ i
        return xor