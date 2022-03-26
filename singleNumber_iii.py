#O(n) time solution
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        if nums is None or len(nums) == 0:
            return nums
        bitMask1 = 0
        for num in nums:
            bitMask1 = bitMask1 ^ num
        temp = bitMask1 & -bitMask1
        bitMask2 = 0
        for num in nums:
            if temp & num != 0:
                bitMask2 = bitMask2 ^ num

        result = []
        result.append(bitMask2)
        result.append(bitMask2 ^ bitMask1)
        return result