#time complexity: O(n)
#Space complexity: O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask,bitmask2=0,0
        for i in range(len(nums)):
            bitmask = bitmask ^ nums[i]
        temp = bitmask & -bitmask
        for i in range(len(nums)):
            if nums[i]&temp!=0:
                bitmask2 = bitmask2 ^ (nums[i])
        return [bitmask2, (bitmask2^bitmask)]
        