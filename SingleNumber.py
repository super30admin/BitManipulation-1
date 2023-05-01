#All TC passed on leetcode

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        #Here we perform XOR operation on each num with prev result. XORing same nums results in 0, 
        #finally leaving behind the non-repeated number.
        #Time complexity - O(n)
        #Space complexity - O(1)

        res = 0
        for n in nums:
            res = res ^ n
        return res
        