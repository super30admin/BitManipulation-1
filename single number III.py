# Time complexity: O(n)
# Space complexity: O(1)
# Approach: XOR1 - find xor of all elements
# temp = xor1 &(-xor1)
# find and  of temp and nums at i.
# if its not 0, xor2 = xor2 ^ nums[i]
# now xor2 is one element
# xor1 ^ xor2 gives other element




class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        xor1 = 0
        xor2 = 0
        for num in nums:
            xor1 = xor1 ^ num
        temp = xor1 & (-xor1)
        for num in nums:
            if(temp & num):
                xor2 = xor2 ^ num
        return ([xor2, xor2^xor1])
                
        