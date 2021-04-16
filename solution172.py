#Time Complexity:O(n)
#Space Complexity:O(1)
#Approach: with bitmask initially as 0 xor every number in the given input with the bitmask. return the bitmask to obtain the missing number.
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask=0
        for num in nums:
            bitmask^=num
        return bitmask